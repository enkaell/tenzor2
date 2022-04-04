package src

class Folder internal constructor(name: String, vararg files: AbstractFileSystemNode) : AbstractFileSystemNode() {
    var childs = ""
    fun returnChilds(): String {
        return childs
    }

    companion object {
        var rootpath: String? = null
    }

    init {
        this.name = name
        if (files.size == 0) {
            rootpath = name
            this.path = "/$name"
        } else this.path = "/" + rootpath + "/" + name
        for (i in 0 until files.size) {
            childs += " " + files[i].name
            if (files[i] is Folder) files[i].path = this.path + files[i].path
        }
    }
}