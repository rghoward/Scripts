package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ds3<T> implements Comparator {
    public final /* synthetic */ vk3 t;

    public ds3(vk3 vk3Var) {
        this.t = vk3Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        vk3 vk3Var = this.t;
        return eo7.f((Comparable) vk3Var.invoke(t), (Comparable) vk3Var.invoke(t2));
    }
}
