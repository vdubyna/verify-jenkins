Map modules = [:]
modules.first = load 'first.groovy'
def test1(){
    echo "second groovy 1"
    modules.first.test1()
}
def test2(){
    echo "second groovy 2"
    modules.first.test2()
}
return this
