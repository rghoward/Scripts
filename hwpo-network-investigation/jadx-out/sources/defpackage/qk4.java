package defpackage;

import io.ably.lib.util.Crypto;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qk4 extends g5b<Integer, m61> {
    public final sta a;
    public final p43 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.domain.usecase.GetChallengeEntryDetailsUseCase", f = "GetChallengeEntryDetailsUseCase.kt", l = {Crypto.DEFAULT_BLOCKLENGTH}, m = "executeOnBackground", v = 2)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public int v;

        public a(u02 u02Var) {
            super(u02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return qk4.this.c(0, this);
        }
    }

    public qk4(sta staVar, p43 p43Var) {
        staVar.getClass();
        p43Var.getClass();
        this.a = staVar;
        this.b = p43Var;
    }

    @Override // defpackage.g5b
    public final /* bridge */ /* synthetic */ Object a(Object obj, g5b.b bVar) {
        return c(((Number) obj).intValue(), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, r02<? super m61> r02Var) throws Throwable {
        a aVar;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i2 = aVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.v = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a((u02) r02Var);
            }
        } else {
            aVar = new a((u02) r02Var);
        }
        Object objA = aVar.t;
        int i3 = aVar.v;
        if (i3 == 0) {
            dv8.b(objA);
            aVar.v = 1;
            objA = this.a.a(i, aVar);
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
        m61 m61Var = (m61) objA;
        vc8 vc8Var = m61Var.d;
        ArrayList arrayListA = ii6.a(vc8Var != null ? vc8Var.c : hf3.t, this.b);
        vc8 vc8Var2 = m61Var.d;
        vc8 vc8Var3 = vc8Var2 != null ? new vc8(vc8Var2.a, vc8Var2.b, arrayListA) : null;
        int i4 = m61Var.a;
        int i5 = m61Var.b;
        String str = m61Var.c;
        bd8 bd8Var = m61Var.e;
        str.getClass();
        return new m61(i4, i5, str, vc8Var3, bd8Var);
    }
}
