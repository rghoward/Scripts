package defpackage;

import com.google.gson.internal.ObjectConstructor;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hy1 implements ObjectConstructor {
    public static /* synthetic */ void a(int i, int i2) {
        throw new IndexOutOfBoundsException("position=" + i + ((Object) ", limit=") + i2);
    }

    public static void b(id4.a aVar, hsa hsaVar) {
        hsaVar.g(new id4(aVar));
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return new ArrayList();
    }
}
