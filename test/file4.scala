class Project(var name: String,var daysToComplete: Int) 

object Test{
    val project2 = new Project("Website redesign", 5)
    def main(args: Array[String]){
        val project1 = new Project("TPS Reports", 1)
        println(project1.name)
        println(project2.daysToComplete)
    }   
        
}
