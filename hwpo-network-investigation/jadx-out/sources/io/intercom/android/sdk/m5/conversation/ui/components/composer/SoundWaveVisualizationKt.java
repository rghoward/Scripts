package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.aa0;
import defpackage.ac4;
import defpackage.at7;
import defpackage.b27;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.ci4;
import defpackage.ct7;
import defpackage.d73;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.h37;
import defpackage.hf3;
import defpackage.hw9;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.jw9;
import defpackage.mx0;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.p27;
import defpackage.qu1;
import defpackage.tq5;
import defpackage.tx2;
import defpackage.uh8;
import defpackage.us3;
import defpackage.wd3;
import defpackage.xj8;
import defpackage.yz9;
import defpackage.zy3;
import defpackage.zz9;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SoundWaveVisualizationKt {

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

    /* JADX WARN: Code duplicated, block: B:100:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x0278  */
    /* JADX WARN: Code duplicated, block: B:103:0x0281  */
    /* JADX WARN: Code duplicated, block: B:106:0x0298  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:122:0x030b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x030d  */
    /* JADX WARN: Code duplicated, block: B:127:0x032a  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0123  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138  */
    /* JADX WARN: Code duplicated, block: B:73:0x0163 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x0183  */
    /* JADX WARN: Code duplicated, block: B:78:0x018d  */
    /* JADX WARN: Code duplicated, block: B:81:0x019c  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:94:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0236  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bj4, jt1] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX INFO: renamed from: SoundWaveVisualization-FNF3uiM, reason: not valid java name */
    public static final void m194SoundWaveVisualizationFNF3uiM(final zz9<Float> zz9Var, ox6 ox6Var, long j, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        long jB;
        ox6 ox6Var3;
        final long j2;
        h37 h37VarC;
        final tq5 tq5Var;
        float fU0;
        float f;
        Object objF;
        jt1.a.C0187a c0187a;
        final DrawingConstants drawingConstants;
        Object objB;
        WaveformBuffer waveformBuffer;
        Object objB2;
        b27 b27Var;
        Object objB3;
        p27 p27Var;
        Object objB4;
        p27 p27Var2;
        boolean zG;
        Object objF2;
        Object objF3;
        float f2;
        b27 b27Var2;
        Object objB5;
        b27 b27Var3;
        boolean zJ;
        b27 b27Var4;
        Object soundWaveVisualizationKt$SoundWaveVisualization$2$1;
        b27 b27Var5;
        jt1.a.C0187a c0187a2;
        ?? r1;
        boolean zJ2;
        Object objF4;
        boolean zG2;
        Object objF5;
        float f3;
        p27 p27Var3;
        float f4;
        boolean zG3;
        Object objF6;
        long jCurrentTimeMillis;
        ArrayList arrayList;
        float timestamp;
        final List list;
        ?? r2;
        Object objF7;
        final ox6 ox6Var4;
        final long j3;
        xj8 xj8VarW;
        int i4;
        zz9Var.getClass();
        ?? O = jt1Var.o(2042015142);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (O.j(zz9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= O.J(ox6Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                jB = j;
                if ((i2 & 4) == 0 || !O.i(jB)) {
                    i4 = 128;
                } else {
                    i4 = 256;
                }
                i3 |= i4;
            } else {
                jB = j;
            }
            if ((i3 & 147) == 146 || !O.r()) {
                O.v0();
                if ((i & 1) != 0 || O.c0()) {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jB = ac4.b(IntercomTheme.INSTANCE, O, IntercomTheme.$stable);
                        i3 &= -897;
                    }
                } else {
                    O.u();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    ox6Var3 = ox6Var2;
                }
                j2 = jB;
                O.V();
                h37VarC = bl7.c(zz9Var, O, i3 & 14);
                tq5Var = (tq5) O.F(qu1.n);
                fU0 = ((tx2) O.F(qu1.h)).U0(4.0f);
                f = fU0 / 150.0f;
                O.K(-1478395297);
                objF = O.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    DrawingConstants drawingConstants2 = new DrawingConstants(2.0f, 1.0f, 3.0f, 0.05f, 0.02f, 0.3f, null);
                    O.C(drawingConstants2);
                    objF = drawingConstants2;
                }
                drawingConstants = (DrawingConstants) objF;
                objB = aa0.b(O, false, -1478381040);
                if (objB == c0187a) {
                    objB = new WaveformBuffer(0, 1, null);
                    O.C(objB);
                }
                waveformBuffer = (WaveformBuffer) objB;
                objB2 = aa0.b(O, false, -1478377961);
                if (objB2 == c0187a) {
                    objB2 = new at7(0.0f);
                    O.C(objB2);
                }
                b27Var = (b27) objB2;
                objB3 = aa0.b(O, false, -1478375594);
                if (objB3 == c0187a) {
                    objB3 = new ct7(0L);
                    O.C(objB3);
                }
                p27Var = (p27) objB3;
                objB4 = aa0.b(O, false, -1478373386);
                if (objB4 == c0187a) {
                    objB4 = new ct7(0L);
                    O.C(objB4);
                }
                p27Var2 = (p27) objB4;
                O.U(false);
                Float fValueOf = Float.valueOf(b27Var.h());
                O.K(-1478368243);
                zG = O.g(fU0) | O.j(waveformBuffer);
                objF2 = O.f();
                if (zG || objF2 == c0187a) {
                    objF2 = new SoundWaveVisualizationKt$SoundWaveVisualization$1$1(fU0, waveformBuffer, b27Var, null);
                    O.C(objF2);
                }
                O.U(false);
                wd3.d(O, (ci4) objF2, fValueOf);
                O.K(-1478357417);
                objF3 = O.f();
                if (objF3 == c0187a) {
                    f2 = 0.0f;
                    objF3 = new at7(0.0f);
                    O.C(objF3);
                } else {
                    f2 = 0.0f;
                }
                b27Var2 = (b27) objF3;
                objB5 = aa0.b(O, false, -1478355337);
                if (objB5 == c0187a) {
                    objB5 = new at7(f2);
                    O.C(objB5);
                }
                b27Var3 = (b27) objB5;
                O.U(false);
                Float fValueOf2 = Float.valueOf(SoundWaveVisualization_FNF3uiM$lambda$0(h37VarC));
                O.K(-1478350286);
                zJ = O.J(h37VarC);
                b27Var4 = b27Var;
                Object objF8 = O.f();
                if (!zJ || objF8 == c0187a) {
                    b27Var5 = b27Var2;
                    c0187a2 = c0187a;
                    r1 = 0;
                    soundWaveVisualizationKt$SoundWaveVisualization$2$1 = new SoundWaveVisualizationKt$SoundWaveVisualization$2$1(drawingConstants, h37VarC, b27Var3, b27Var5, null);
                    O.C(soundWaveVisualizationKt$SoundWaveVisualization$2$1);
                } else {
                    c0187a2 = c0187a;
                    b27Var5 = b27Var2;
                    soundWaveVisualizationKt$SoundWaveVisualization$2$1 = objF8;
                    r1 = 0;
                }
                O.U(r1);
                wd3.d(O, (ci4) soundWaveVisualizationKt$SoundWaveVisualization$2$1, fValueOf2);
                g2b g2bVar = g2b.a;
                O.K(-1478322020);
                zJ2 = O.j(waveformBuffer);
                objF4 = O.f();
                if (zJ2 || objF4 == c0187a2) {
                    objF4 = new SoundWaveVisualizationKt$SoundWaveVisualization$3$1(150L, waveformBuffer, b27Var4, p27Var, b27Var5, null);
                    O.C(objF4);
                }
                O.U(r1);
                wd3.d(O, (ci4) objF4, g2bVar);
                O.K(-1478285170);
                zG2 = O.g(fU0) | O.g(f) | O.j(waveformBuffer);
                objF5 = O.f();
                if (!zG2 || objF5 == c0187a2) {
                    f3 = fU0;
                    p27Var3 = p27Var2;
                    f4 = f;
                    SoundWaveVisualizationKt$SoundWaveVisualization$4$1 soundWaveVisualizationKt$SoundWaveVisualization$4$1 = new SoundWaveVisualizationKt$SoundWaveVisualization$4$1(f3, f4, waveformBuffer, 16L, b27Var4, p27Var3, null);
                    b27Var4 = b27Var4;
                    O.C(soundWaveVisualizationKt$SoundWaveVisualization$4$1);
                    objF5 = soundWaveVisualizationKt$SoundWaveVisualization$4$1;
                } else {
                    f3 = fU0;
                    p27Var3 = p27Var2;
                    f4 = f;
                }
                O.U(r1);
                wd3.d(O, (ci4) objF5, g2bVar);
                float fH = b27Var4.h();
                long jB2 = p27Var3.b();
                O.K(-1478261140);
                zG3 = O.g(fH) | O.i(jB2);
                objF6 = O.f();
                if (zG3 || objF6 == c0187a2) {
                    if (b27Var4.h() > 0.0f) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        arrayList = new ArrayList();
                        for (WaveformElement waveformElement : waveformBuffer.getAllElements()) {
                            timestamp = (jCurrentTimeMillis - waveformElement.getTimestamp()) * f4;
                            if (timestamp <= b27Var4.h() + f3) {
                                arrayList.add(WaveformElement.copy$default(waveformElement, timestamp, 0.0f, 0L, 6, null));
                            }
                        }
                        objF6 = arrayList;
                    } else {
                        objF6 = hf3.t;
                    }
                    O.C(objF6);
                }
                list = (List) objF6;
                O.U(r1);
                ox6 ox6VarD = ir9.d(ir9.c(ox6Var3, 1.0f), 24.0f);
                O.K(-1478221951);
                r2 = (O.j(list) ? 1 : 0) | (((((i3 & 896) ^ 384) > 256 || !O.i(j2)) && (i3 & 384) != 256) ? r1 : 1) | (O.J(tq5Var) ? 1 : 0);
                objF7 = O.f();
                if (r2 == 0 || objF7 == c0187a2) {
                    final b27 b27Var6 = b27Var4;
                    oh4 oh4Var = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.s0
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$26$lambda$25(list, j2, drawingConstants, tq5Var, b27Var6, (d73) obj);
                        }
                    };
                    O.C(oh4Var);
                    objF7 = oh4Var;
                }
                O.U(r1);
                us3.b(ox6VarD, (oh4) objF7, O, r1);
                ox6Var4 = ox6Var3;
                j3 = j2;
            } else {
                O.u();
                ox6Var4 = ox6Var2;
                j3 = jB;
            }
            xj8VarW = O.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: iw9
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$27(zz9Var, ox6Var4, j3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i & 384) == 0) {
            jB = j;
            if ((i2 & 4) == 0) {
                i4 = 128;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        } else {
            jB = j;
        }
        if ((i3 & 147) == 146) {
            O.v0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    jB = ac4.b(IntercomTheme.INSTANCE, O, IntercomTheme.$stable);
                    i3 &= -897;
                }
            } else {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    jB = ac4.b(IntercomTheme.INSTANCE, O, IntercomTheme.$stable);
                    i3 &= -897;
                }
            }
            j2 = jB;
            O.V();
            h37VarC = bl7.c(zz9Var, O, i3 & 14);
            tq5Var = (tq5) O.F(qu1.n);
            fU0 = ((tx2) O.F(qu1.h)).U0(4.0f);
            f = fU0 / 150.0f;
            O.K(-1478395297);
            objF = O.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                DrawingConstants drawingConstants3 = new DrawingConstants(2.0f, 1.0f, 3.0f, 0.05f, 0.02f, 0.3f, null);
                O.C(drawingConstants3);
                objF = drawingConstants3;
            }
            drawingConstants = (DrawingConstants) objF;
            objB = aa0.b(O, false, -1478381040);
            if (objB == c0187a) {
                objB = new WaveformBuffer(0, 1, null);
                O.C(objB);
            }
            waveformBuffer = (WaveformBuffer) objB;
            objB2 = aa0.b(O, false, -1478377961);
            if (objB2 == c0187a) {
                objB2 = new at7(0.0f);
                O.C(objB2);
            }
            b27Var = (b27) objB2;
            objB3 = aa0.b(O, false, -1478375594);
            if (objB3 == c0187a) {
                objB3 = new ct7(0L);
                O.C(objB3);
            }
            p27Var = (p27) objB3;
            objB4 = aa0.b(O, false, -1478373386);
            if (objB4 == c0187a) {
                objB4 = new ct7(0L);
                O.C(objB4);
            }
            p27Var2 = (p27) objB4;
            O.U(false);
            Float fValueOf3 = Float.valueOf(b27Var.h());
            O.K(-1478368243);
            zG = O.g(fU0) | O.j(waveformBuffer);
            objF2 = O.f();
            if (zG) {
                objF2 = new SoundWaveVisualizationKt$SoundWaveVisualization$1$1(fU0, waveformBuffer, b27Var, null);
                O.C(objF2);
            } else {
                objF2 = new SoundWaveVisualizationKt$SoundWaveVisualization$1$1(fU0, waveformBuffer, b27Var, null);
                O.C(objF2);
            }
            O.U(false);
            wd3.d(O, (ci4) objF2, fValueOf3);
            O.K(-1478357417);
            objF3 = O.f();
            if (objF3 == c0187a) {
                f2 = 0.0f;
                objF3 = new at7(0.0f);
                O.C(objF3);
            } else {
                f2 = 0.0f;
            }
            b27Var2 = (b27) objF3;
            objB5 = aa0.b(O, false, -1478355337);
            if (objB5 == c0187a) {
                objB5 = new at7(f2);
                O.C(objB5);
            }
            b27Var3 = (b27) objB5;
            O.U(false);
            Float fValueOf4 = Float.valueOf(SoundWaveVisualization_FNF3uiM$lambda$0(h37VarC));
            O.K(-1478350286);
            zJ = O.J(h37VarC);
            b27Var4 = b27Var;
            Object objF9 = O.f();
            if (zJ) {
                b27Var5 = b27Var2;
                c0187a2 = c0187a;
                r1 = 0;
                soundWaveVisualizationKt$SoundWaveVisualization$2$1 = new SoundWaveVisualizationKt$SoundWaveVisualization$2$1(drawingConstants, h37VarC, b27Var3, b27Var5, null);
                O.C(soundWaveVisualizationKt$SoundWaveVisualization$2$1);
            } else {
                b27Var5 = b27Var2;
                c0187a2 = c0187a;
                r1 = 0;
                soundWaveVisualizationKt$SoundWaveVisualization$2$1 = new SoundWaveVisualizationKt$SoundWaveVisualization$2$1(drawingConstants, h37VarC, b27Var3, b27Var5, null);
                O.C(soundWaveVisualizationKt$SoundWaveVisualization$2$1);
            }
            O.U(r1);
            wd3.d(O, (ci4) soundWaveVisualizationKt$SoundWaveVisualization$2$1, fValueOf4);
            g2b g2bVar2 = g2b.a;
            O.K(-1478322020);
            zJ2 = O.j(waveformBuffer);
            objF4 = O.f();
            if (zJ2) {
                objF4 = new SoundWaveVisualizationKt$SoundWaveVisualization$3$1(150L, waveformBuffer, b27Var4, p27Var, b27Var5, null);
                O.C(objF4);
            } else {
                objF4 = new SoundWaveVisualizationKt$SoundWaveVisualization$3$1(150L, waveformBuffer, b27Var4, p27Var, b27Var5, null);
                O.C(objF4);
            }
            O.U(r1);
            wd3.d(O, (ci4) objF4, g2bVar2);
            O.K(-1478285170);
            zG2 = O.g(fU0) | O.g(f) | O.j(waveformBuffer);
            objF5 = O.f();
            if (zG2) {
                f3 = fU0;
                p27Var3 = p27Var2;
                f4 = f;
                SoundWaveVisualizationKt$SoundWaveVisualization$4$1 soundWaveVisualizationKt$SoundWaveVisualization$4$2 = new SoundWaveVisualizationKt$SoundWaveVisualization$4$1(f3, f4, waveformBuffer, 16L, b27Var4, p27Var3, null);
                b27Var4 = b27Var4;
                O.C(soundWaveVisualizationKt$SoundWaveVisualization$4$2);
                objF5 = soundWaveVisualizationKt$SoundWaveVisualization$4$2;
            } else {
                f3 = fU0;
                p27Var3 = p27Var2;
                f4 = f;
                SoundWaveVisualizationKt$SoundWaveVisualization$4$1 soundWaveVisualizationKt$SoundWaveVisualization$4$3 = new SoundWaveVisualizationKt$SoundWaveVisualization$4$1(f3, f4, waveformBuffer, 16L, b27Var4, p27Var3, null);
                b27Var4 = b27Var4;
                O.C(soundWaveVisualizationKt$SoundWaveVisualization$4$3);
                objF5 = soundWaveVisualizationKt$SoundWaveVisualization$4$3;
            }
            O.U(r1);
            wd3.d(O, (ci4) objF5, g2bVar2);
            float fH2 = b27Var4.h();
            long jB3 = p27Var3.b();
            O.K(-1478261140);
            zG3 = O.g(fH2) | O.i(jB3);
            objF6 = O.f();
            if (zG3) {
                if (b27Var4.h() > 0.0f) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    arrayList = new ArrayList();
                    while (r8.hasNext()) {
                        timestamp = (jCurrentTimeMillis - waveformElement.getTimestamp()) * f4;
                        if (timestamp <= b27Var4.h() + f3) {
                            arrayList.add(WaveformElement.copy$default(waveformElement, timestamp, 0.0f, 0L, 6, null));
                        }
                    }
                    objF6 = arrayList;
                } else {
                    objF6 = hf3.t;
                }
                O.C(objF6);
            } else {
                if (b27Var4.h() > 0.0f) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    arrayList = new ArrayList();
                    while (r8.hasNext()) {
                        timestamp = (jCurrentTimeMillis - waveformElement.getTimestamp()) * f4;
                        if (timestamp <= b27Var4.h() + f3) {
                            arrayList.add(WaveformElement.copy$default(waveformElement, timestamp, 0.0f, 0L, 6, null));
                        }
                    }
                    objF6 = arrayList;
                } else {
                    objF6 = hf3.t;
                }
                O.C(objF6);
            }
            list = (List) objF6;
            O.U(r1);
            ox6 ox6VarD2 = ir9.d(ir9.c(ox6Var3, 1.0f), 24.0f);
            O.K(-1478221951);
            r2 = (O.j(list) ? 1 : 0) | (((((i3 & 896) ^ 384) > 256 || !O.i(j2)) && (i3 & 384) != 256) ? r1 : 1) | (O.J(tq5Var) ? 1 : 0);
            objF7 = O.f();
            if (r2 == 0) {
                final b27 b27Var7 = b27Var4;
                oh4 oh4Var2 = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.s0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$26$lambda$25(list, j2, drawingConstants, tq5Var, b27Var7, (d73) obj);
                    }
                };
                O.C(oh4Var2);
                objF7 = oh4Var2;
            } else {
                final b27 b27Var8 = b27Var4;
                oh4 oh4Var3 = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.s0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$26$lambda$25(list, j2, drawingConstants, tq5Var, b27Var8, (d73) obj);
                    }
                };
                O.C(oh4Var3);
                objF7 = oh4Var3;
            }
            O.U(r1);
            us3.b(ox6VarD2, (oh4) objF7, O, r1);
            ox6Var4 = ox6Var3;
            j3 = j2;
        } else {
            O.v0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    jB = ac4.b(IntercomTheme.INSTANCE, O, IntercomTheme.$stable);
                    i3 &= -897;
                }
            } else {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    jB = ac4.b(IntercomTheme.INSTANCE, O, IntercomTheme.$stable);
                    i3 &= -897;
                }
            }
            j2 = jB;
            O.V();
            h37VarC = bl7.c(zz9Var, O, i3 & 14);
            tq5Var = (tq5) O.F(qu1.n);
            fU0 = ((tx2) O.F(qu1.h)).U0(4.0f);
            f = fU0 / 150.0f;
            O.K(-1478395297);
            objF = O.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                DrawingConstants drawingConstants4 = new DrawingConstants(2.0f, 1.0f, 3.0f, 0.05f, 0.02f, 0.3f, null);
                O.C(drawingConstants4);
                objF = drawingConstants4;
            }
            drawingConstants = (DrawingConstants) objF;
            objB = aa0.b(O, false, -1478381040);
            if (objB == c0187a) {
                objB = new WaveformBuffer(0, 1, null);
                O.C(objB);
            }
            waveformBuffer = (WaveformBuffer) objB;
            objB2 = aa0.b(O, false, -1478377961);
            if (objB2 == c0187a) {
                objB2 = new at7(0.0f);
                O.C(objB2);
            }
            b27Var = (b27) objB2;
            objB3 = aa0.b(O, false, -1478375594);
            if (objB3 == c0187a) {
                objB3 = new ct7(0L);
                O.C(objB3);
            }
            p27Var = (p27) objB3;
            objB4 = aa0.b(O, false, -1478373386);
            if (objB4 == c0187a) {
                objB4 = new ct7(0L);
                O.C(objB4);
            }
            p27Var2 = (p27) objB4;
            O.U(false);
            Float fValueOf5 = Float.valueOf(b27Var.h());
            O.K(-1478368243);
            zG = O.g(fU0) | O.j(waveformBuffer);
            objF2 = O.f();
            if (zG) {
                objF2 = new SoundWaveVisualizationKt$SoundWaveVisualization$1$1(fU0, waveformBuffer, b27Var, null);
                O.C(objF2);
            } else {
                objF2 = new SoundWaveVisualizationKt$SoundWaveVisualization$1$1(fU0, waveformBuffer, b27Var, null);
                O.C(objF2);
            }
            O.U(false);
            wd3.d(O, (ci4) objF2, fValueOf5);
            O.K(-1478357417);
            objF3 = O.f();
            if (objF3 == c0187a) {
                f2 = 0.0f;
                objF3 = new at7(0.0f);
                O.C(objF3);
            } else {
                f2 = 0.0f;
            }
            b27Var2 = (b27) objF3;
            objB5 = aa0.b(O, false, -1478355337);
            if (objB5 == c0187a) {
                objB5 = new at7(f2);
                O.C(objB5);
            }
            b27Var3 = (b27) objB5;
            O.U(false);
            Float fValueOf6 = Float.valueOf(SoundWaveVisualization_FNF3uiM$lambda$0(h37VarC));
            O.K(-1478350286);
            zJ = O.J(h37VarC);
            b27Var4 = b27Var;
            Object objF10 = O.f();
            if (zJ) {
                b27Var5 = b27Var2;
                c0187a2 = c0187a;
                r1 = 0;
                soundWaveVisualizationKt$SoundWaveVisualization$2$1 = new SoundWaveVisualizationKt$SoundWaveVisualization$2$1(drawingConstants, h37VarC, b27Var3, b27Var5, null);
                O.C(soundWaveVisualizationKt$SoundWaveVisualization$2$1);
            } else {
                b27Var5 = b27Var2;
                c0187a2 = c0187a;
                r1 = 0;
                soundWaveVisualizationKt$SoundWaveVisualization$2$1 = new SoundWaveVisualizationKt$SoundWaveVisualization$2$1(drawingConstants, h37VarC, b27Var3, b27Var5, null);
                O.C(soundWaveVisualizationKt$SoundWaveVisualization$2$1);
            }
            O.U(r1);
            wd3.d(O, (ci4) soundWaveVisualizationKt$SoundWaveVisualization$2$1, fValueOf6);
            g2b g2bVar3 = g2b.a;
            O.K(-1478322020);
            zJ2 = O.j(waveformBuffer);
            objF4 = O.f();
            if (zJ2) {
                objF4 = new SoundWaveVisualizationKt$SoundWaveVisualization$3$1(150L, waveformBuffer, b27Var4, p27Var, b27Var5, null);
                O.C(objF4);
            } else {
                objF4 = new SoundWaveVisualizationKt$SoundWaveVisualization$3$1(150L, waveformBuffer, b27Var4, p27Var, b27Var5, null);
                O.C(objF4);
            }
            O.U(r1);
            wd3.d(O, (ci4) objF4, g2bVar3);
            O.K(-1478285170);
            zG2 = O.g(fU0) | O.g(f) | O.j(waveformBuffer);
            objF5 = O.f();
            if (zG2) {
                f3 = fU0;
                p27Var3 = p27Var2;
                f4 = f;
                SoundWaveVisualizationKt$SoundWaveVisualization$4$1 soundWaveVisualizationKt$SoundWaveVisualization$4$4 = new SoundWaveVisualizationKt$SoundWaveVisualization$4$1(f3, f4, waveformBuffer, 16L, b27Var4, p27Var3, null);
                b27Var4 = b27Var4;
                O.C(soundWaveVisualizationKt$SoundWaveVisualization$4$4);
                objF5 = soundWaveVisualizationKt$SoundWaveVisualization$4$4;
            } else {
                f3 = fU0;
                p27Var3 = p27Var2;
                f4 = f;
                SoundWaveVisualizationKt$SoundWaveVisualization$4$1 soundWaveVisualizationKt$SoundWaveVisualization$4$5 = new SoundWaveVisualizationKt$SoundWaveVisualization$4$1(f3, f4, waveformBuffer, 16L, b27Var4, p27Var3, null);
                b27Var4 = b27Var4;
                O.C(soundWaveVisualizationKt$SoundWaveVisualization$4$5);
                objF5 = soundWaveVisualizationKt$SoundWaveVisualization$4$5;
            }
            O.U(r1);
            wd3.d(O, (ci4) objF5, g2bVar3);
            float fH3 = b27Var4.h();
            long jB4 = p27Var3.b();
            O.K(-1478261140);
            zG3 = O.g(fH3) | O.i(jB4);
            objF6 = O.f();
            if (zG3) {
                if (b27Var4.h() > 0.0f) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    arrayList = new ArrayList();
                    while (r8.hasNext()) {
                        timestamp = (jCurrentTimeMillis - waveformElement.getTimestamp()) * f4;
                        if (timestamp <= b27Var4.h() + f3) {
                            arrayList.add(WaveformElement.copy$default(waveformElement, timestamp, 0.0f, 0L, 6, null));
                        }
                    }
                    objF6 = arrayList;
                } else {
                    objF6 = hf3.t;
                }
                O.C(objF6);
            } else {
                if (b27Var4.h() > 0.0f) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    arrayList = new ArrayList();
                    while (r8.hasNext()) {
                        timestamp = (jCurrentTimeMillis - waveformElement.getTimestamp()) * f4;
                        if (timestamp <= b27Var4.h() + f3) {
                            arrayList.add(WaveformElement.copy$default(waveformElement, timestamp, 0.0f, 0L, 6, null));
                        }
                    }
                    objF6 = arrayList;
                } else {
                    objF6 = hf3.t;
                }
                O.C(objF6);
            }
            list = (List) objF6;
            O.U(r1);
            ox6 ox6VarD3 = ir9.d(ir9.c(ox6Var3, 1.0f), 24.0f);
            O.K(-1478221951);
            r2 = (O.j(list) ? 1 : 0) | (((((i3 & 896) ^ 384) > 256 || !O.i(j2)) && (i3 & 384) != 256) ? r1 : 1) | (O.J(tq5Var) ? 1 : 0);
            objF7 = O.f();
            if (r2 == 0) {
                final b27 b27Var9 = b27Var4;
                oh4 oh4Var4 = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.s0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$26$lambda$25(list, j2, drawingConstants, tq5Var, b27Var9, (d73) obj);
                    }
                };
                O.C(oh4Var4);
                objF7 = oh4Var4;
            } else {
                final b27 b27Var10 = b27Var4;
                oh4 oh4Var5 = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.s0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$26$lambda$25(list, j2, drawingConstants, tq5Var, b27Var10, (d73) obj);
                    }
                };
                O.C(oh4Var5);
                objF7 = oh4Var5;
            }
            O.U(r1);
            us3.b(ox6VarD3, (oh4) objF7, O, r1);
            ox6Var4 = ox6Var3;
            j3 = j2;
        }
        xj8VarW = O.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: iw9
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$27(zz9Var, ox6Var4, j3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void SoundWaveVisualizationLowAmplitudePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1762579162);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SoundWaveVisualizationKt.INSTANCE.m178getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new hw9(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SoundWaveVisualizationLowAmplitudePreview$lambda$30(int i, jt1 jt1Var, int i2) {
        SoundWaveVisualizationLowAmplitudePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void SoundWaveVisualizationPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(888011189);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SoundWaveVisualizationKt.INSTANCE.m177getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new jw9(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SoundWaveVisualizationPreview$lambda$29(int i, jt1 jt1Var, int i2) {
        SoundWaveVisualizationPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void SoundWaveVisualizationRtlPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-436763649);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SoundWaveVisualizationKt.INSTANCE.m179getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new mx0(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SoundWaveVisualizationRtlPreview$lambda$31(int i, jt1 jt1Var, int i2) {
        SoundWaveVisualizationRtlPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SoundWaveVisualization_FNF3uiM$lambda$0(yz9<Float> yz9Var) {
        return yz9Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SoundWaveVisualization_FNF3uiM$lambda$26$lambda$25(List list, long j, DrawingConstants drawingConstants, tq5 tq5Var, b27 b27Var, d73 d73Var) {
        d73Var.getClass();
        b27Var.g(Float.intBitsToFloat((int) (d73Var.c() >> 32)));
        m195drawWaveformElementscf5BqRc(d73Var, list, j, drawingConstants, Float.intBitsToFloat((int) (d73Var.c() >> 32)), Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)), tq5Var);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SoundWaveVisualization_FNF3uiM$lambda$27(zz9 zz9Var, ox6 ox6Var, long j, int i, int i2, jt1 jt1Var, int i3) {
        m194SoundWaveVisualizationFNF3uiM(zz9Var, ox6Var, j, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final int calculateOptimalBufferSize(float f, float f2) {
        if (f <= 0.0f || f2 <= 0.0f) {
            return 70;
        }
        return uh8.g((int) (((int) (f / f2)) * 1.5f), 50, 200);
    }

    /* JADX INFO: renamed from: drawWaveformElements-cf5BqRc, reason: not valid java name */
    private static final void m195drawWaveformElementscf5BqRc(d73 d73Var, List<WaveformElement> list, long j, DrawingConstants drawingConstants, float f, float f2, tq5 tq5Var) {
        float x;
        if (list.isEmpty()) {
            return;
        }
        DrawingConstantsPx px = drawingConstants.toPx(d73Var.getDensity());
        float f3 = f2 * 0.5f;
        float barWidth = px.getBarWidth() * 0.5f;
        float barWidth2 = px.getBarWidth() * 0.5f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(barWidth)) << 32) | (((long) Float.floatToRawIntBits(barWidth2)) & 4294967295L);
        for (WaveformElement waveformElement : list) {
            int iOrdinal = tq5Var.ordinal();
            if (iOrdinal == 0) {
                x = f - waveformElement.getX();
            } else {
                if (iOrdinal != 1) {
                    defpackage.u.b();
                    return;
                }
                x = waveformElement.getX();
            }
            if (x >= (-px.getBarWidth()) && x <= f + px.getBarWidth()) {
                if (waveformElement.getAmplitude() < px.getAmplitudeThreshold()) {
                    d73.N(d73Var, j, px.getDotRadius(), (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 0, 120);
                } else {
                    float fMax = Math.max(px.getMinBarHeight(), Math.min(f2, waveformElement.getAmplitude() * f2));
                    d73Var.S0(j, (((long) Float.floatToRawIntBits(x - (px.getBarWidth() * 0.5f))) << 32) | (((long) Float.floatToRawIntBits(f3 - (fMax * 0.5f))) & 4294967295L), (((long) Float.floatToRawIntBits(px.getBarWidth())) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), jFloatToRawIntBits, zy3.a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scaleAmplitudeForVisualization(float f) {
        float f2 = f * f;
        return Math.min(1.0f, (f2 / (0.2f + f2)) * 1.6f);
    }
}
