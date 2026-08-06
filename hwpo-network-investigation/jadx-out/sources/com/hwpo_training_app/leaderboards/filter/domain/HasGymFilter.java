package com.hwpo_training_app.leaderboards.filter.domain;

import defpackage.aa0;
import defpackage.dv8;
import defpackage.h5b;
import defpackage.js7;
import defpackage.pc2;
import defpackage.u02;
import defpackage.v72;
import defpackage.xj5;
import defpackage.yp4;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface HasGymFilter {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Serializable a(HasGymFilter hasGymFilter, pc2 pc2Var, u02 u02Var) throws Throwable {
        HasGymFilter$getGymIdAndType$1 hasGymFilter$getGymIdAndType$1;
        if (u02Var instanceof HasGymFilter$getGymIdAndType$1) {
            hasGymFilter$getGymIdAndType$1 = (HasGymFilter$getGymIdAndType$1) u02Var;
            int i = hasGymFilter$getGymIdAndType$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                hasGymFilter$getGymIdAndType$1.v = i - Integer.MIN_VALUE;
            } else {
                hasGymFilter$getGymIdAndType$1 = new HasGymFilter$getGymIdAndType$1(hasGymFilter, u02Var);
            }
        } else {
            hasGymFilter$getGymIdAndType$1 = new HasGymFilter$getGymIdAndType$1(hasGymFilter, u02Var);
        }
        Object objC = hasGymFilter$getGymIdAndType$1.t;
        int i2 = hasGymFilter$getGymIdAndType$1.v;
        if (i2 == 0) {
            dv8.b(objC);
            if (!hasGymFilter.c()) {
                js7<Integer, String> js7VarB = hasGymFilter.b();
                return new js7(js7VarB != null ? js7VarB.t : null, null);
            }
            hasGymFilter$getGymIdAndType$1.v = 1;
            objC = pc2Var.c(hasGymFilter$getGymIdAndType$1);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objC);
        }
        yp4 yp4Var = ((h5b) objC).j;
        if (yp4Var instanceof yp4.a) {
            return new js7(new Integer(((yp4.a) yp4Var).t), null);
        }
        return (xj5.a(yp4Var, yp4.c.t) || xj5.a(yp4Var, yp4.b.t)) ? new js7(null, yp4Var.toString()) : new js7(null, null);
    }

    js7<Integer, String> b();

    boolean c();
}
