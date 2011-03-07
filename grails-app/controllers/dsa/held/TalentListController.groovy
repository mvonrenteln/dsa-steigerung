package dsa.held

import grails.converters.JSON;


class TalentListController {

	def index = {
		redirect(action: "list", params: params)
	}

	def list = {
		[talentGruppen: EnumSet.allOf(TalentGruppe)]
	}

	def listTalente = {
		Map talente = new Held().init()?.getTalenteNachGruppen()
		render ([talente: talente, totalCount: talente?.size()] as JSON)
	}
}
