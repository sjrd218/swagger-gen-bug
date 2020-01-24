package groovy.openapi.gen.bug

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
    info = @Info(
            title = "groovy-openapi-gen-bug",
            version = "0.1",
            description = "Swagger generation of groovy pogos should not generate MetaClass ref"
    )
)
@CompileStatic
class Application {
    static void main(String[] args) {
        Micronaut.run(Application)
    }
}