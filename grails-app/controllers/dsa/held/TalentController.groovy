package dsa.held

class TalentController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [talentInstanceList: Talent.list(params), talentInstanceTotal: Talent.count()]
    }

    def create = {
        def talentInstance = new Talent()
        talentInstance.properties = params
        return [talentInstance: talentInstance]
    }

    def save = {
        def talentInstance = new Talent(params)
        if (talentInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'talent.label', default: 'Talent'), talentInstance.id])}"
            redirect(action: "show", id: talentInstance.id)
        }
        else {
            render(view: "create", model: [talentInstance: talentInstance])
        }
    }

    def show = {
        def talentInstance = Talent.get(params.id)
        if (!talentInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'talent.label', default: 'Talent'), params.id])}"
            redirect(action: "list")
        }
        else {
            [talentInstance: talentInstance]
        }
    }

    def edit = {
        def talentInstance = Talent.get(params.id)
        if (!talentInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'talent.label', default: 'Talent'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [talentInstance: talentInstance]
        }
    }

    def update = {
        def talentInstance = Talent.get(params.id)
        if (talentInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (talentInstance.version > version) {
                    
                    talentInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'talent.label', default: 'Talent')] as Object[], "Another user has updated this Talent while you were editing")
                    render(view: "edit", model: [talentInstance: talentInstance])
                    return
                }
            }
            talentInstance.properties = params
            if (!talentInstance.hasErrors() && talentInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'talent.label', default: 'Talent'), talentInstance.id])}"
                redirect(action: "show", id: talentInstance.id)
            }
            else {
                render(view: "edit", model: [talentInstance: talentInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'talent.label', default: 'Talent'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def talentInstance = Talent.get(params.id)
        if (talentInstance) {
            try {
                talentInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'talent.label', default: 'Talent'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'talent.label', default: 'Talent'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'talent.label', default: 'Talent'), params.id])}"
            redirect(action: "list")
        }
    }
}
