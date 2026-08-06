package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kj8<T extends View> implements mib<T> {
    public final T t;

    /* JADX WARN: Multi-variable type inference failed */
    public kj8(View view) {
        this.t = view;
    }

    @Override // defpackage.mib
    public final T a() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kj8) {
            return xj5.a(this.t, ((kj8) obj).t);
        }
        return false;
    }

    @Override // defpackage.mib
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.t.hashCode() * 31);
    }
}
