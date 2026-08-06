package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m24 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ m24(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() throws IOException {
        Object obj;
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                File fileB = s.b((Context) obj2, "firebaseSessions/sessionDataStore.data");
                n24.b(fileB);
                return fileB;
            default:
                ArrayList arrayList = ((m07) obj2).e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float fB = ((os7) obj3).a.b();
                    int i2 = 1;
                    int size = arrayList.size() - 1;
                    if (1 <= size) {
                        while (true) {
                            Object obj4 = arrayList.get(i2);
                            float fB2 = ((os7) obj4).a.b();
                            if (Float.compare(fB, fB2) < 0) {
                                obj3 = obj4;
                                fB = fB2;
                            }
                            if (i2 != size) {
                                i2++;
                            }
                        }
                    }
                    obj = obj3;
                }
                os7 os7Var = (os7) obj;
                return Float.valueOf(os7Var != null ? os7Var.a.b() : 0.0f);
        }
    }
}
