package defpackage;

import com.hwpo_training_app.reschedule.data.entity.RescheduleMaxDayResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zs8 implements ws8 {
    public final zr8 a;

    public zs8(zr8 zr8Var) {
        zr8Var.getClass();
        this.a = zr8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ws8
    public final Object a(int i, u02 u02Var) throws Throwable {
        xs8 xs8Var;
        if (u02Var instanceof xs8) {
            xs8Var = (xs8) u02Var;
            int i2 = xs8Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xs8Var.v = i2 - Integer.MIN_VALUE;
            } else {
                xs8Var = new xs8(this, u02Var);
            }
        } else {
            xs8Var = new xs8(this, u02Var);
        }
        Object objA = xs8Var.t;
        int i3 = xs8Var.v;
        if (i3 == 0) {
            dv8.b(objA);
            xs8Var.v = 1;
            objA = this.a.a(i, xs8Var);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objA);
        }
        return new Integer(((RescheduleMaxDayResponse) objA).a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ws8
    public final Object b(int i, String str, int i2, u02 u02Var) throws Throwable {
        ys8 ys8Var;
        if (u02Var instanceof ys8) {
            ys8Var = (ys8) u02Var;
            int i3 = ys8Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ys8Var.v = i3 - Integer.MIN_VALUE;
            } else {
                ys8Var = new ys8(this, u02Var);
            }
        } else {
            ys8Var = new ys8(this, u02Var);
        }
        Object objB = ys8Var.t;
        int i4 = ys8Var.v;
        if (i4 == 0) {
            dv8.b(objB);
            ys8Var.v = 1;
            objB = this.a.b(i, str, i2, ys8Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i4 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objB);
        }
        ru8 ru8Var = (ru8) objB;
        if (ru8Var.a.J) {
            return g2b.a;
        }
        throw new q45(ru8Var);
    }
}
