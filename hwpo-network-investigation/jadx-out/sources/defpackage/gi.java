package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gi {
    public final hi a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public hi h;
    public boolean b = true;
    public final HashMap i = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<hi, g2b> {
        public a() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(hi hiVar) {
            gi giVar;
            hi hiVar2 = hiVar;
            if (hiVar2.B() != Integer.MAX_VALUE) {
                if (hiVar2.l().b) {
                    hiVar2.S();
                }
                Iterator it = hiVar2.l().i.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    giVar = gi.this;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    gi.a(giVar, (ei) entry.getKey(), ((Number) entry.getValue()).intValue(), hiVar2.t());
                }
                mb7 mb7Var = hiVar2.t().L;
                mb7Var.getClass();
                while (!mb7Var.equals(giVar.a.t())) {
                    for (ei eiVar : giVar.c(mb7Var).keySet()) {
                        gi.a(giVar, eiVar, giVar.d(mb7Var, eiVar), mb7Var);
                    }
                    mb7Var = mb7Var.L;
                    mb7Var.getClass();
                }
            }
            return g2b.a;
        }
    }

    public gi(hi hiVar) {
        this.a = hiVar;
    }

    public static final void a(gi giVar, ei eiVar, int i, mb7 mb7Var) {
        long jB;
        HashMap map = giVar.i;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = giVar.b(mb7Var, jB);
                mb7Var = mb7Var.L;
                mb7Var.getClass();
                if (mb7Var.equals(giVar.a.t())) {
                    break loop0;
                }
            } while (!giVar.c(mb7Var).containsKey(eiVar));
            float fD = giVar.d(mb7Var, eiVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fD);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fD);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(eiVar instanceof e15 ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (jB >> 32)));
        if (map.containsKey(eiVar)) {
            int iIntValue = ((Number) qi6.h(eiVar, map)).intValue();
            e15 e15Var = fi.a;
            iRound = eiVar.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound)).intValue();
        }
        map.put(eiVar, Integer.valueOf(iRound));
    }

    public abstract long b(mb7 mb7Var, long j);

    public abstract Map<ei, Integer> c(mb7 mb7Var);

    public abstract int d(mb7 mb7Var, ei eiVar);

    public final boolean e() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean f() {
        i();
        return this.h != null;
    }

    public final void g() {
        this.b = true;
        hi hiVar = this.a;
        hi hiVarX = hiVar.x();
        if (hiVarX == null) {
            return;
        }
        if (this.c) {
            hiVarX.b0();
        } else if (this.e || this.d) {
            hiVarX.requestLayout();
        }
        if (this.f) {
            hiVar.b0();
        }
        if (this.g) {
            hiVar.requestLayout();
        }
        hiVarX.l().g();
    }

    public final void h() {
        HashMap map = this.i;
        map.clear();
        a aVar = new a();
        hi hiVar = this.a;
        hiVar.J(aVar);
        map.putAll(c(hiVar.t()));
        this.b = false;
    }

    public final void i() {
        gi giVarL;
        gi giVarL2;
        boolean zE = e();
        hi hiVar = this.a;
        if (!zE) {
            hi hiVarX = hiVar.x();
            if (hiVarX == null) {
                return;
            }
            hiVar = hiVarX.l().h;
            if (hiVar == null || !hiVar.l().e()) {
                hi hiVar2 = this.h;
                if (hiVar2 == null || hiVar2.l().e()) {
                    return;
                }
                hi hiVarX2 = hiVar2.x();
                if (hiVarX2 != null && (giVarL2 = hiVarX2.l()) != null) {
                    giVarL2.i();
                }
                hi hiVarX3 = hiVar2.x();
                hiVar = (hiVarX3 == null || (giVarL = hiVarX3.l()) == null) ? null : giVarL.h;
            }
        }
        this.h = hiVar;
    }
}
