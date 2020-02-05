def test1(modules){
    echo "second groovy 1" + params.environment
    modules.first.test1()
}
def test2(modules){
    echo "second groovy 2"
    modules.first.test2()
}
return this
