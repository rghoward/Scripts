package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m9a implements k76 {
    public final Set<j9a<?>> t = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.k76
    public final void a() {
        ArrayList arrayListE = l6b.e(this.t);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((j9a) obj).a();
        }
    }

    @Override // defpackage.k76
    public final void f() {
        ArrayList arrayListE = l6b.e(this.t);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((j9a) obj).f();
        }
    }

    @Override // defpackage.k76
    public final void k() {
        ArrayList arrayListE = l6b.e(this.t);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((j9a) obj).k();
        }
    }
}
