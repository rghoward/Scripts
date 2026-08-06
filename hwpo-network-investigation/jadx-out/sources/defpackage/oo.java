package defpackage;

import android.content.Context;
import android.os.Build;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oo implements jo4 {
    public static boolean f = true;
    public final cm a;
    public final Object b = new Object();
    public khb c;
    public boolean d;
    public final mo e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final long a(cm cmVar) {
            return cmVar.getUniqueDrawingId();
        }
    }

    public oo(cm cmVar) {
        this.a = cmVar;
        mo moVar = new mo(this);
        this.e = moVar;
        if (cmVar.isAttachedToWindow()) {
            Context context = cmVar.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(moVar);
                this.d = true;
            }
        }
        cmVar.addOnAttachStateChangeListener(new no(this));
    }

    @Override // defpackage.jo4
    public final void a(ko4 ko4Var) {
        synchronized (this.b) {
            if (!ko4Var.s) {
                ko4Var.s = true;
                ko4Var.b();
            }
            g2b g2bVar = g2b.a;
        }
    }

    @Override // defpackage.jo4
    public final ko4 b() {
        no4 vo4Var;
        no4 uo4Var;
        ko4 ko4Var;
        synchronized (this.b) {
            try {
                cm cmVar = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    a.a(cmVar);
                }
                if (i >= 29) {
                    uo4Var = new uo4();
                } else {
                    if (f) {
                        try {
                            vo4Var = new to4(this.a, new u41(), new s41());
                        } catch (Throwable unused) {
                            f = false;
                            vo4Var = new vo4(c(this.a));
                        }
                    } else {
                        vo4Var = new vo4(c(this.a));
                    }
                    uo4Var = vo4Var;
                }
                ko4Var = new ko4(uo4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ko4Var;
    }

    public final w63 c(cm cmVar) {
        khb khbVar = this.c;
        if (khbVar != null) {
            return khbVar;
        }
        khb khbVar2 = new khb(cmVar.getContext());
        khbVar2.setClipChildren(false);
        khbVar2.setClipToPadding(false);
        khbVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        cmVar.addView(khbVar2, -1);
        this.c = khbVar2;
        return khbVar2;
    }
}
