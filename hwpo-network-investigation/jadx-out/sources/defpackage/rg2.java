package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rg2 implements w40 {
    public final Object a;

    public rg2() {
        this.a = b0a.b(q1b.b);
    }

    public xz9 a() {
        return (xz9) ((a0a) this.a).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    public void b(xz9 xz9Var) {
        Object value;
        xz9 xz9Var2;
        xz9Var.getClass();
        a0a a0aVar = (a0a) this.a;
        do {
            value = a0aVar.getValue();
            xz9Var2 = (xz9) value;
            if ((xz9Var2 instanceof di8) || xj5.a(xz9Var2, q1b.b)) {
                xz9Var2 = xz9Var;
            } else if (xz9Var2 instanceof ne2) {
                if (xz9Var.a > ((ne2) xz9Var2).a) {
                    xz9Var2 = xz9Var;
                }
            } else if (!(xz9Var2 instanceof yz3)) {
                if (xz9Var2 instanceof hb7) {
                    aa0.c("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return;
                } else {
                    u.b();
                    return;
                }
            }
        } while (!a0aVar.c(value, xz9Var2));
    }

    @Override // defpackage.w40
    public ListenableFuture call() {
        final z4d z4dVar = (z4d) this.a;
        z4dVar.getClass();
        x40 x40Var = new x40() { // from class: y4d
            @Override // defpackage.x40
            public final ListenableFuture apply(Object obj) {
                Uri uri = (Uri) obj;
                z4d z4dVar2 = z4dVar;
                z4dVar2.getClass();
                Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    j2d j2dVar = z4dVar2.e;
                    h2d h2dVarB = j2dVar.b(uriBuild);
                    if (h2dVarB.a.b(h2dVarB.d)) {
                        h2d h2dVarB2 = j2dVar.b(uriBuild);
                        h2d h2dVarB3 = j2dVar.b(uri);
                        k3d k3dVar = h2dVarB2.a;
                        if (k3dVar != h2dVarB3.a) {
                            throw new c3d("Cannot rename file across backends");
                        }
                        k3dVar.g(h2dVarB2.d, h2dVarB3.d);
                    }
                    return t85.u;
                } catch (IOException e) {
                    return ti4.j1(e);
                }
            }
        };
        int i = v7d.a;
        return ti4.l1(ti4.n1(z4dVar.b, new m7d(m6d.a(), x40Var), z4dVar.d));
    }

    public /* synthetic */ rg2(z4d z4dVar) {
        this.a = z4dVar;
    }
}
