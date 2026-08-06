package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", l = {182}, m = "invokeSuspend", v = 1)
public final class cs extends p6a implements oh4<r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ zr u;
    public final /* synthetic */ gca v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(zr zrVar, gca gcaVar, r02<? super cs> r02Var) {
        super(1, r02Var);
        this.u = zrVar;
        this.v = gcaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new cs(this.u, this.v, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((cs) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        uaa uaaVarInvoke;
        final zr zrVar = this.u;
        jv9 jv9Var = zrVar.e;
        View view = zrVar.a;
        int i = this.t;
        try {
            if (i == 0) {
                dv8.b(obj);
                zr.b bVar = new zr.b();
                int i2 = 0;
                gca gcaVar = this.v;
                uaa aVar = new zr.a(bVar, new sr(i2, zrVar, gcaVar), new tr(i2, zrVar, gcaVar), view);
                oh4<uaa, uaa> oh4Var = zrVar.b;
                if (oh4Var != null && (uaaVarInvoke = oh4Var.invoke(aVar)) != null) {
                    aVar = uaaVarInvoke;
                }
                Looper looperMyLooper = Looper.myLooper();
                Handler handler = view.getHandler();
                if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                    as asVar = zrVar.i;
                    if (asVar == null) {
                        asVar = new as(zrVar, aVar, bVar, i2);
                        zrVar.i = asVar;
                    }
                    view.post(asVar);
                } else {
                    ActionMode actionModeStartActionMode = view.startActionMode(new p54(aVar), 1);
                    if (actionModeStartActionMode == null) {
                        return g2b.a;
                    }
                    zrVar.h = actionModeStartActionMode;
                }
                this.t = 1;
                zx0 zx0Var = bVar.a;
                zx0Var.getClass();
                Object objK = zx0.K(zx0Var, this);
                Object obj2 = v72.t;
                if (objK != obj2) {
                    objK = g2b.a;
                }
                if (objK == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            jv9Var.a();
            Looper looperMyLooper2 = Looper.myLooper();
            Handler handler2 = view.getHandler();
            if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                Runnable runnable = zrVar.j;
                if (runnable == null) {
                    runnable = new Runnable() { // from class: bs
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActionMode actionMode = zrVar.h;
                            if (actionMode != null) {
                                actionMode.finish();
                            }
                        }
                    };
                    zrVar.j = runnable;
                }
                view.post(runnable);
            } else {
                ActionMode actionMode = zrVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            as asVar2 = zrVar.i;
            if (asVar2 != null) {
                view.removeCallbacks(asVar2);
            }
            zrVar.h = null;
            return g2b.a;
        } catch (Throwable th) {
            jv9Var.a();
            Looper looperMyLooper3 = Looper.myLooper();
            Handler handler3 = view.getHandler();
            if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                Runnable runnable2 = zrVar.j;
                if (runnable2 == null) {
                    runnable2 = new Runnable() { // from class: bs
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActionMode actionMode2 = zrVar.h;
                            if (actionMode2 != null) {
                                actionMode2.finish();
                            }
                        }
                    };
                    zrVar.j = runnable2;
                }
                view.post(runnable2);
            } else {
                ActionMode actionMode2 = zrVar.h;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            as asVar3 = zrVar.i;
            if (asVar3 != null) {
                view.removeCallbacks(asVar3);
            }
            zrVar.h = null;
            throw th;
        }
    }
}
