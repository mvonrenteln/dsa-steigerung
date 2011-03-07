package dsa.held


class TalentListController {

	def index = {
		redirect(action: "list", params: params)
	}

	def list = {
		Map talente = new Held().init()?.getTalenteNachGruppen()
		[talentList: talente, talentTotal: talente?.size()]
	}
}
