package AnnotationProcessorPK;


import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;



@SupportedAnnotationTypes(
        {
                "annotations.MyClassAnnotation",
                "annotations.MySourceAnnotation",
                "annotations.MyRuntimeAnnotation"
        })
@SupportedSourceVersion(SourceVersion.RELEASE_11)
// Annotation processors extend AbstractProcessor
public class AnnotationProcessor extends AbstractProcessor {

    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {
        for (TypeElement annotation : annotations) {
            for (Element element : roundEnv.getElementsAnnotatedWith(
                    annotation)) {
                System.out.println(
                        element.getKind() + " " +
                                element.getEnclosingElement() + "." +
                                element + " is annotated with " +
                                annotation);
            }
        }
        // return true if this is the only processor permitted to
        // process the annotations listed in SupportedAnnotationTypes
        return true;
    }
}