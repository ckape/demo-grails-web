package helloworld

class Hello {
    String id
    String name
    static mapping = {
        id generator: 'uuid'
    }

    @Override
    String toString() {
        return String.format("id: %s; name: %s", id, name)
    }
}
