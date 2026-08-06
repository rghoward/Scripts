package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class e08 implements d08 {
    public static final a Companion = new a();
    public final o7a a;
    public final o7a b = new o7a(new rj(1, this));

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.data.repository.PlanOptionRepositoryImpl$planOptionObservable$2$1", f = "PlanOptionRepositoryImpl.kt", l = {31}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<ua8<? super zz7>, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;

        public b(r02<? super b> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = e08.this.new b(r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(ua8<? super zz7> ua8Var, r02<? super g2b> r02Var) {
            return ((b) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, f08] */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            final ua8 ua8Var = (ua8) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                final e08 e08Var = e08.this;
                final ?? r6 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: f08
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                        int i2;
                        Integer numB;
                        if (str == null || (numB = e08Var.b((i2 = Integer.parseInt(str)))) == null) {
                            return;
                        }
                        ua8Var.n(new zz7(i2, numB.intValue()));
                    }
                };
                ((SharedPreferences) e08Var.a.getValue()).registerOnSharedPreferenceChangeListener(r6);
                mh4 mh4Var = new mh4() { // from class: g08
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        ((SharedPreferences) e08Var.a.getValue()).unregisterOnSharedPreferenceChangeListener(r6);
                        return g2b.a;
                    }
                };
                this.u = null;
                this.t = 1;
                Object objA = qa8.a(ua8Var, mh4Var, this);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    public e08(Context context) {
        this.a = new o7a(new oj(2, context));
    }

    @Override // defpackage.d08
    public final r54<zz7> a() {
        return (r54) this.b.getValue();
    }

    @Override // defpackage.d08
    public final Integer b(int i) {
        int i2 = ((SharedPreferences) this.a.getValue()).getInt(String.valueOf(i), -1);
        Integer numValueOf = Integer.valueOf(i2);
        if (i2 != -1) {
            return numValueOf;
        }
        return null;
    }

    @Override // defpackage.d08
    public final void c(int i, int i2) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.a.getValue();
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt(String.valueOf(i), i2);
        editorEdit.apply();
    }
}
