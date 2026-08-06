package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        t27<cm> t27Var = cm.j1;
        synchronized (t27Var) {
            try {
                int i = Build.VERSION.SDK_INT;
                Object[] objArr = t27Var.a;
                int i2 = t27Var.b;
                int i3 = 0;
                if (i < 30) {
                    for (int i4 = 0; i4 < i2; i4++) {
                        cm cmVar = (cm) objArr[i4];
                        boolean showLayoutBounds = cmVar.getShowLayoutBounds();
                        Class<?> cls = cm.g1;
                        cmVar.setShowLayoutBounds(cm.a.a());
                        if (showLayoutBounds != cmVar.getShowLayoutBounds()) {
                            cmVar.post(new am(i3, cmVar));
                        }
                    }
                } else {
                    while (i3 < i2) {
                        final cm cmVar2 = (cm) objArr[i3];
                        cmVar2.post(new Runnable() { // from class: bm
                            @Override // java.lang.Runnable
                            public final void run() {
                                cm.U(cmVar2.getRoot());
                            }
                        });
                        i3++;
                    }
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
