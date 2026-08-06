package defpackage;

import com.hwpo_training_app.core.data.model.schedule.ProgramSectionNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hl4 extends g5b<a, hd8> {
    public final s49 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return a30.b("Params(programId=", ", sectionId=", ")", this.a, this.b);
        }
    }

    public hl4(s49 s49Var) {
        s49Var.getClass();
        this.a = s49Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a aVar, u02 u02Var) throws Throwable {
        jl4 jl4Var;
        if (u02Var instanceof jl4) {
            jl4Var = (jl4) u02Var;
            int i = jl4Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                jl4Var.v = i - Integer.MIN_VALUE;
            } else {
                jl4Var = new jl4(this, u02Var);
            }
        } else {
            jl4Var = new jl4(this, u02Var);
        }
        Object objA = jl4Var.t;
        int i2 = jl4Var.v;
        if (i2 == 0) {
            dv8.b(objA);
            int i3 = aVar.a;
            int i4 = aVar.b;
            jl4Var.v = 1;
            objA = this.a.a(i3, i4, jl4Var);
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
        hd8 hd8VarB = ((ProgramSectionNetworkEntity) objA).a();
        return hd8.a(hd8VarB, false, th1.N(hd8VarB.j, new il4()), 32255);
    }
}
