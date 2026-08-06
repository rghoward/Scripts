package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sp4 extends g52.a {
    public final Gson a;

    public sp4(Gson gson) {
        this.a = gson;
    }

    @Override // g52.a
    public final g52<?, qp8> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, mv8 mv8Var) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.a;
        return new tp4(gson, gson.getAdapter(typeToken));
    }

    @Override // g52.a
    public final g52<su8, ?> b(Type type, Annotation[] annotationArr, mv8 mv8Var) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.a;
        return new up4(gson, gson.getAdapter(typeToken));
    }
}
