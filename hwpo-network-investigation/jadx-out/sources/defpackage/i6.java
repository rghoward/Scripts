package defpackage;

import com.hwpo_training_app.core.data.model.user.UserNetworkEntity;
import com.intercom.twig.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i6 implements h6 {
    public static final a Companion = new a();
    public final c5 a;
    public final wg9 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public i6(c5 c5Var, wg9 wg9Var) {
        c5Var.getClass();
        wg9Var.getClass();
        this.a = c5Var;
        this.b = wg9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.h6
    public final Object a(u02 u02Var) throws Throwable {
        k6 k6Var;
        if (u02Var instanceof k6) {
            k6Var = (k6) u02Var;
            int i = k6Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                k6Var.v = i - Integer.MIN_VALUE;
            } else {
                k6Var = new k6(this, u02Var);
            }
        } else {
            k6Var = new k6(this, u02Var);
        }
        Object objA = k6Var.t;
        int i2 = k6Var.v;
        if (i2 == 0) {
            dv8.b(objA);
            String string = UUID.randomUUID().toString();
            string.getClass();
            g01 g01Var = g01.w;
            g01 g01VarC = g01.a.c(string);
            wq6 wq6Var = n17.e;
            ArrayList arrayList = new ArrayList();
            wq6 wq6Var2 = n17.f;
            wq6Var2.getClass();
            if (!wq6Var2.b.equals("multipart")) {
                r.a(wq6Var2, "multipart != ");
                return null;
            }
            arrayList.add(n17.c.a.a("avatar", BuildConfig.FLAVOR));
            if (arrayList.isEmpty()) {
                aa0.c("Multipart body must have at least one part.");
                return null;
            }
            n17.c cVar = new n17(g01VarC, wq6Var2, ytb.k(arrayList)).b.get(0);
            k6Var.v = 1;
            objA = this.a.a(cVar, k6Var);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objA);
        }
        this.b.c(((UserNetworkEntity) objA).a());
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.h6
    public final Object b(ByteArrayOutputStream byteArrayOutputStream, String str, String str2, u02 u02Var) throws Throwable {
        l6 l6Var;
        if (u02Var instanceof l6) {
            l6Var = (l6) u02Var;
            int i = l6Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6Var.v = i - Integer.MIN_VALUE;
            } else {
                l6Var = new l6(this, u02Var);
            }
        } else {
            l6Var = new l6(this, u02Var);
        }
        Object objA = l6Var.t;
        int i2 = l6Var.v;
        wq6 wq6VarA = null;
        if (i2 == 0) {
            dv8.b(objA);
            qp8.a aVar = qp8.Companion;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            ol8 ol8Var = wq6.e;
            str2.getClass();
            try {
                wq6VarA = wq6.a.a(str2);
            } catch (IllegalArgumentException unused) {
            }
            n17.c cVarB = n17.c.a.b("avatar", str, qp8.a.c(aVar, byteArray, wq6VarA, 0, 6));
            l6Var.v = 1;
            objA = this.a.a(cVarB, l6Var);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objA);
        }
        this.b.c(((UserNetworkEntity) objA).a());
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.h6
    public final Object c(u02 u02Var) throws Throwable {
        j6 j6Var;
        if (u02Var instanceof j6) {
            j6Var = (j6) u02Var;
            int i = j6Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                j6Var.v = i - Integer.MIN_VALUE;
            } else {
                j6Var = new j6(this, u02Var);
            }
        } else {
            j6Var = new j6(this, u02Var);
        }
        Object objB = j6Var.t;
        int i2 = j6Var.v;
        if (i2 == 0) {
            dv8.b(objB);
            j6Var.v = 1;
            objB = this.a.b(j6Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
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
