package defpackage;

import android.util.Patterns;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t7b implements r54<r7b<String>> {
    public final /* synthetic */ v7b t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;

        /* JADX INFO: renamed from: t7b$a$a, reason: collision with other inner class name */
        @xm2(c = "com.hwpo_training_app.core.validation.ValidatorKt$email$$inlined$map$1$2", f = "Validator.kt", l = {217}, m = "emit", v = 2)
        public static final class C0248a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0248a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var) {
            this.t = s54Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0248a c0248a;
            if (r02Var instanceof C0248a) {
                c0248a = (C0248a) r02Var;
                int i = c0248a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0248a.u = i - Integer.MIN_VALUE;
                } else {
                    c0248a = new C0248a(r02Var);
                }
            } else {
                c0248a = new C0248a(r02Var);
            }
            Object obj2 = c0248a.t;
            int i2 = c0248a.u;
            if (i2 == 0) {
                dv8.b(obj2);
                r7b r7bVar = (r7b) obj;
                r7bVar.getClass();
                String str = (String) r7bVar.a;
                str.getClass();
                r7bVar.b = Patterns.EMAIL_ADDRESS.matcher(str).find();
                c0248a.u = 1;
                Object objEmit = this.t.emit(r7bVar, c0248a);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj2);
            }
            return g2b.a;
        }
    }

    public t7b(v7b v7bVar) {
        this.t = v7bVar;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super r7b<String>> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}
