package defpackage;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w7a {
    public final int a;
    public final int b;
    public final int c;
    public final oh4<Resources, Boolean> d;

    public w7a(int i, int i2, int i3, oh4 oh4Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = oh4Var;
    }

    public final int a(boolean z) {
        if (this.c == 0) {
            return 0;
        }
        return z ? this.b : this.a;
    }
}
