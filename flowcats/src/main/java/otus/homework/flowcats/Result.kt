package otus.homework.flowcats

typealias BaseError = Error

sealed interface Result<out D> {
    data class Success<out D>(val data: D) : Result<D>
    data class Error(val error: Throwable) : Result<Unit>
}