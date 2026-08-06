package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ys3 extends g52.a {
    public final wq6 a;
    public final vd9.a b;

    public ys3(wq6 wq6Var, vd9.a aVar) {
        this.a = wq6Var;
        this.b = aVar;
    }

    @Override // g52.a
    public final g52<?, qp8> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, mv8 mv8Var) {
        type.getClass();
        annotationArr2.getClass();
        vd9.a aVar = this.b;
        aVar.getClass();
        KSerializer kSerializerN = eo7.n(((sl5) aVar.c()).d(), type);
        wq6 wq6Var = this.a;
        wq6Var.getClass();
        aVar.getClass();
        m01 m01Var = new m01();
        m01Var.a = wq6Var;
        m01Var.b = kSerializerN;
        m01Var.c = aVar;
        return m01Var;
    }

    @Override // g52.a
    public final g52<su8, ?> b(Type type, Annotation[] annotationArr, mv8 mv8Var) {
        annotationArr.getClass();
        vd9.a aVar = this.b;
        aVar.getClass();
        return new ty2(eo7.n(((sl5) aVar.c()).d(), type), aVar);
    }
}
