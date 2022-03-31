package src

internal interface FileSystemNode {
    fun returnParent(): String?
    fun returnName(): String?
    fun returnPath(): String?
}