package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.data.repository.ProgramsRepositoryImpl", f = "ProgramsRepositoryImpl.kt", l = {47, 52, 89}, m = "listOfProgramsForDatesRange", v = 2)
public final class pd8 extends u02 {
    public /* synthetic */ Object A;
    public final /* synthetic */ sd8 B;
    public int C;
    public long t;
    public long u;
    public Object v;
    public Iterator w;
    public Iterator x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd8(sd8 sd8Var, u02 u02Var) {
        super(u02Var);
        this.B = sd8Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(0L, 0L, this);
    }
}
