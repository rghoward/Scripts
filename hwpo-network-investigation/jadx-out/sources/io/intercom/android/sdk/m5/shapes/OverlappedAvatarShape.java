package io.intercom.android.sdk.m5.shapes;

import defpackage.dm7;
import defpackage.em7;
import defpackage.jl9;
import defpackage.qq2;
import defpackage.tq5;
import defpackage.tx2;
import defpackage.u;
import defpackage.vp;
import defpackage.xp;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class OverlappedAvatarShape implements jl9 {
    public static final int $stable = 0;
    private final jl9 currentAvatarShape;
    private final float cut;
    private final jl9 previousAvatarShape;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[tq5.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private OverlappedAvatarShape(jl9 jl9Var, jl9 jl9Var2, float f) {
        jl9Var.getClass();
        jl9Var2.getClass();
        this.currentAvatarShape = jl9Var;
        this.previousAvatarShape = jl9Var2;
        this.cut = f;
    }

    /* JADX INFO: renamed from: getOffset-dBAh8RU, reason: not valid java name */
    private final long m395getOffsetdBAh8RU(float f, tq5 tq5Var) {
        int i = WhenMappings.$EnumSwitchMapping$0[tq5Var.ordinal()];
        if (i == 1) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f)));
        }
        if (i == 2) {
            return (((long) Float.floatToRawIntBits(-f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f)));
        }
        u.b();
        return 0L;
    }

    @Override // defpackage.jl9
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public dm7 mo0createOutlinePq9zytI(long j, tq5 tq5Var, tx2 tx2Var) {
        tq5Var.getClass();
        tx2Var.getClass();
        float fU0 = tx2Var.U0(this.cut);
        vp vpVarA = xp.a();
        em7.a(vpVarA, this.currentAvatarShape.mo0createOutlinePq9zytI(j, tq5Var, tx2Var));
        vp vpVarA2 = xp.a();
        em7.a(vpVarA2, this.previousAvatarShape.mo0createOutlinePq9zytI(j, tq5Var, tx2Var));
        vp vpVarA3 = xp.a();
        vpVarA3.o(vpVarA2, m395getOffsetdBAh8RU(fU0 - Float.intBitsToFloat((int) (j >> 32)), tq5Var));
        vp vpVarA4 = xp.a();
        vpVarA4.r(vpVarA, vpVarA3, 0);
        return new dm7.a(vpVarA4);
    }

    public /* synthetic */ OverlappedAvatarShape(jl9 jl9Var, jl9 jl9Var2, float f, qq2 qq2Var) {
        this(jl9Var, jl9Var2, f);
    }

    public /* synthetic */ OverlappedAvatarShape(jl9 jl9Var, jl9 jl9Var2, float f, int i, qq2 qq2Var) {
        this(jl9Var, (i & 2) != 0 ? jl9Var : jl9Var2, f, null);
    }
}
