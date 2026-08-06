package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zh1 {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(s79 s79Var, float f, ty9 ty9Var, u02 u02Var) throws Throwable {
        i69 i69Var;
        dl8 dl8Var;
        if (u02Var instanceof i69) {
            i69Var = (i69) u02Var;
            int i = i69Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                i69Var.v = i - Integer.MIN_VALUE;
            } else {
                i69Var = new i69(u02Var);
            }
        } else {
            i69Var = new i69(u02Var);
        }
        Object obj = i69Var.u;
        int i2 = i69Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            dl8 dl8Var2 = new dl8();
            ci4<? super t69, ? super r02<? super g2b>, ? extends Object> k69Var = new k69(f, ty9Var, dl8Var2, null);
            i69Var.t = dl8Var2;
            i69Var.v = 1;
            Object objC = s79Var.c(o37.t, k69Var, i69Var);
            Object obj2 = v72.t;
            if (objC == obj2) {
                return obj2;
            }
            dl8Var = dl8Var2;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dl8Var = i69Var.t;
            dv8.b(obj);
        }
        return new Float(dl8Var.t);
    }

    public static float[] b() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(s79 s79Var, float f, u02 u02Var) throws Throwable {
        l69 l69Var;
        dl8 dl8Var;
        if (u02Var instanceof l69) {
            l69Var = (l69) u02Var;
            int i = l69Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                l69Var.v = i - Integer.MIN_VALUE;
            } else {
                l69Var = new l69(u02Var);
            }
        } else {
            l69Var = new l69(u02Var);
        }
        Object obj = l69Var.u;
        int i2 = l69Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            dl8 dl8Var2 = new dl8();
            ci4<? super t69, ? super r02<? super g2b>, ? extends Object> m69Var = new m69(dl8Var2, f, null);
            l69Var.t = dl8Var2;
            l69Var.v = 1;
            Object objC = s79Var.c(o37.t, m69Var, l69Var);
            Object obj2 = v72.t;
            if (objC == obj2) {
                return obj2;
            }
            dl8Var = dl8Var2;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dl8Var = l69Var.t;
            dv8.b(obj);
        }
        return new Float(dl8Var.t);
    }

    public static final void d(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = 1.0f - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }
}
