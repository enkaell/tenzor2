package src

class File internal constructor(name: String, exp: String, folder: AbstractFileSystemNode) : AbstractFileSystemNode() {
    var exp: String
    fun returnExp(): String {
        return exp
    }

    init {
        this.name = name
        this.exp = exp
        this.path = folder.path.toString() + "/" + name + "." + exp
    }
}
