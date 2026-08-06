package defpackage;

import com.google.firebase.datatransport.TransportRegistrar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p51 implements gb6.a, qq1 {
    public static Object b(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static /* synthetic */ void c(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void d(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    @Override // defpackage.qq1
    public Object a(xu8 xu8Var) {
        return TransportRegistrar.lambda$getComponents$1(xu8Var);
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        ((aj) obj).getClass();
    }
}
