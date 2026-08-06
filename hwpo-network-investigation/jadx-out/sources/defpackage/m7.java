package defpackage;

import androidx.emoji2.text.d;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m7 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ m7(int i) {
        this.t = i;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        switch (this.t) {
            case 0:
                int i = r7.G;
                return Boolean.valueOf(((t7) obj).f);
            case 1:
                return g2b.a;
            default:
                ufa ufaVar = (ufa) obj;
                String str = ufaVar.g.u;
                long j = ufaVar.f;
                int i2 = lja.c;
                int i3 = (int) (j & 4294967295L);
                if (i3 > 0) {
                    d dVarE = rh0.e();
                    if (dVarE != null) {
                        int iB = dVarE.b(str, i3 - 1);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i3 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i3, -1);
                        }
                    } else if (i3 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i3, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new lx2(((int) (ufaVar.f & 4294967295L)) - iOffsetByCodePoints, 0);
        }
    }
}
