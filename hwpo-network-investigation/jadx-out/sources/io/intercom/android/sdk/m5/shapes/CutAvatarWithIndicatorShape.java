package io.intercom.android.sdk.m5.shapes;

import defpackage.ay8;
import defpackage.dm7;
import defpackage.em7;
import defpackage.jl9;
import defpackage.qq2;
import defpackage.tq5;
import defpackage.tx2;
import defpackage.u;
import defpackage.vp;
import defpackage.xp;
import defpackage.zx8;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CutAvatarWithIndicatorShape implements jl9 {
    public static final int $stable = 0;
    private final float indicatorSize;
    private final jl9 shape;

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

    private CutAvatarWithIndicatorShape(jl9 jl9Var, float f) {
        jl9Var.getClass();
        this.shape = jl9Var;
        this.indicatorSize = f;
    }

    /* JADX INFO: renamed from: getOffset-XPhi94U, reason: not valid java name */
    private final long m393getOffsetXPhi94U(long j, float f, float f2, float f3, tq5 tq5Var) {
        int i = WhenMappings.$EnumSwitchMapping$0[tq5Var.ordinal()];
        if (i == 1) {
            return (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j >> 32)) - f) + f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        }
        if (i == 2) {
            return (((long) Float.floatToRawIntBits(0.0f - f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        }
        u.b();
        return 0L;
    }

    @Override // defpackage.jl9
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public dm7 mo0createOutlinePq9zytI(long j, tq5 tq5Var, tx2 tx2Var) {
        tq5Var.getClass();
        tx2Var.getClass();
        float fU0 = tx2Var.U0(2.0f);
        float fU1 = (2.0f * fU0) + tx2Var.U0(this.indicatorSize);
        zx8 zx8Var = ay8.a;
        vp vpVarA = xp.a();
        em7.a(vpVarA, this.shape.mo0createOutlinePq9zytI(j, tq5Var, tx2Var));
        vp vpVarA2 = xp.a();
        em7.a(vpVarA2, zx8Var.mo0createOutlinePq9zytI((((long) Float.floatToRawIntBits(fU1)) << 32) | (((long) Float.floatToRawIntBits(fU1)) & 4294967295L), tq5Var, tx2Var));
        vp vpVarA3 = xp.a();
        vpVarA3.o(vpVarA2, m393getOffsetXPhi94U(j, fU1, fU0, (Float.intBitsToFloat((int) (j & 4294967295L)) - fU1) + fU0, tq5Var));
        vp vpVarA4 = xp.a();
        vpVarA4.r(vpVarA, vpVarA3, 0);
        return new dm7.a(vpVarA4);
    }

    public /* synthetic */ CutAvatarWithIndicatorShape(jl9 jl9Var, float f, qq2 qq2Var) {
        this(jl9Var, f);
    }
}
