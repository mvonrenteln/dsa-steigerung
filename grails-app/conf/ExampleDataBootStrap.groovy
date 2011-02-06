
class ExampleDataBootStrap {
	
	def init = { servletContext ->
		environments {
			production {
				servletContext.setAttribute("env", "prod")
			}
			development {
				servletContext.setAttribute("env", "dev")
			}
		}
	}
	
}
