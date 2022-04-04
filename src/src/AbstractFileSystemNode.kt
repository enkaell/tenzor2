package src

open class AbstractFileSystemNode : FileSystemNode {
    var name: String? = null
    var path: String? = null

    @Override
    override fun returnParent(): String {
        return super.toString()
    }

    @Override
    override fun returnName(): String? {
        return name
    }

    @Override
    override fun returnPath(): String? {
        return path
    }
}