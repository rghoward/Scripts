package io.intercom.android.sdk.m5.components;

import defpackage.a30;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jl9;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.qq2;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.zx8;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.shapes.OverlappedAvatarShape;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarGroupKt {
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7 A[PHI: r0 r2 r3
      0x00a7: PHI (r0v18 int) = (r0v14 int), (r0v19 int) binds: [B:68:0x00b4, B:60:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r2v7 float) = (r2v3 float), (r2v9 float) binds: [B:68:0x00b4, B:60:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r3v7 ox6) = (r3v3 ox6), (r3v2 ox6) binds: [B:68:0x00b4, B:60:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x0105  */
    /* JADX WARN: Code duplicated, block: B:75:0x0109  */
    /* JADX WARN: Code duplicated, block: B:79:0x013a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0142  */
    /* JADX WARN: Code duplicated, block: B:83:0x0146  */
    /* JADX WARN: Code duplicated, block: B:84:0x0157  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: AvatarGroup--J8mCjc, reason: not valid java name */
    public static final void m19AvatarGroupJ8mCjc(final List<AvatarWrapper> list, ox6 ox6Var, float f, long j, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        int i4;
        float f2;
        int i5;
        long j2;
        int i6;
        ox6.a aVar;
        float f3;
        long j3;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        qq2 qq2Var;
        int i7;
        final float f4;
        final ox6 ox6Var3;
        final long j4;
        int i8;
        AvatarWrapper avatarWrapper;
        jl9 overlappedAvatarShape;
        xj8 xj8VarW;
        list.getClass();
        bj4 bj4VarO = jt1Var.o(-258460642);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    f2 = f;
                    if (bj4VarO.g(f2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j2 = j;
                        int i10 = bj4VarO.i(j2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                        i3 |= i10;
                    } else {
                        j2 = j;
                    }
                    i3 |= i10;
                } else {
                    j2 = j;
                }
                if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                    bj4VarO.v0();
                    i6 = i & 1;
                    aVar = ox6.a.t;
                    if (i6 != 0 || bj4VarO.c0()) {
                        if (i9 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            f3 = 38.0f;
                        } else {
                            f3 = f2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        bj4VarO.V();
                        c30.h hVar = new c30.h(-2.0f, true, new a30());
                        ox6 ox6VarQ = ir9.q(ox6Var2);
                        ny8VarA = ly8.a(hVar, di.a.j, bj4VarO, 6);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarQ);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        qq2Var = null;
                        if (bj4VarO.a != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(700807476);
                        i7 = 0;
                        for (Object obj : list) {
                            i8 = i7 + 1;
                            if (i7 >= 0) {
                                ?? r20 = qq2Var;
                                ws0.m();
                                throw r20;
                            }
                            avatarWrapper = (AvatarWrapper) obj;
                            if (i7 == 0) {
                                AvatarShape shape = avatarWrapper.getAvatar().getShape();
                                shape.getClass();
                                overlappedAvatarShape = AvatarIconKt.getComposeShape(shape);
                            } else {
                                AvatarShape shape2 = list.get(i7 - 1).getAvatar().getShape();
                                shape2.getClass();
                                zx8 composeShape = AvatarIconKt.getComposeShape(shape2);
                                AvatarShape shape3 = avatarWrapper.getAvatar().getShape();
                                shape3.getClass();
                                overlappedAvatarShape = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape3), composeShape, 4.0f, qq2Var);
                            }
                            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), avatarWrapper, overlappedAvatarShape, false, j3, null, bj4VarO, 57344 & (i3 << 3), 40);
                            qq2Var = qq2Var;
                            i7 = i8;
                            aVar = aVar;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        ox6 ox6Var4 = ox6Var2;
                        f4 = f3;
                        ox6Var3 = ox6Var4;
                        j4 = j3;
                    } else {
                        bj4VarO.u();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        f3 = f2;
                    }
                    j3 = j2;
                    bj4VarO.V();
                    c30.h hVar2 = new c30.h(-2.0f, true, new a30());
                    ox6 ox6VarQ2 = ir9.q(ox6Var2);
                    ny8VarA = ly8.a(hVar2, di.a.j, bj4VarO, 6);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarQ2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    qq2Var = null;
                    if (bj4VarO.a != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(700807476);
                    i7 = 0;
                    while (r4.hasNext()) {
                        i8 = i7 + 1;
                        if (i7 >= 0) {
                            ?? r21 = qq2Var;
                            ws0.m();
                            throw r21;
                        }
                        avatarWrapper = (AvatarWrapper) obj;
                        if (i7 == 0) {
                            AvatarShape shape4 = avatarWrapper.getAvatar().getShape();
                            shape4.getClass();
                            overlappedAvatarShape = AvatarIconKt.getComposeShape(shape4);
                        } else {
                            AvatarShape shape5 = list.get(i7 - 1).getAvatar().getShape();
                            shape5.getClass();
                            zx8 composeShape2 = AvatarIconKt.getComposeShape(shape5);
                            AvatarShape shape6 = avatarWrapper.getAvatar().getShape();
                            shape6.getClass();
                            overlappedAvatarShape = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape6), composeShape2, 4.0f, qq2Var);
                        }
                        AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), avatarWrapper, overlappedAvatarShape, false, j3, null, bj4VarO, 57344 & (i3 << 3), 40);
                        qq2Var = qq2Var;
                        i7 = i8;
                        aVar = aVar;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    ox6 ox6Var5 = ox6Var2;
                    f4 = f3;
                    ox6Var3 = ox6Var5;
                    j4 = j3;
                } else {
                    bj4VarO.u();
                    ox6Var3 = ox6Var2;
                    f4 = f2;
                    j4 = j2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: uf0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AvatarGroupKt.AvatarGroup__J8mCjc$lambda$2(list, ox6Var3, f4, j4, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            f2 = f;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (bj4VarO.i(j2)) {
                    }
                    i3 |= i10;
                } else {
                    j2 = j;
                }
                i3 |= i10;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) == 1170) {
                bj4VarO.v0();
                i6 = i & 1;
                aVar = ox6.a.t;
                if (i6 != 0) {
                    if (i9 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        f3 = 38.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    } else {
                        j3 = j2;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        f3 = 38.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    } else {
                        j3 = j2;
                    }
                }
                bj4VarO.V();
                c30.h hVar3 = new c30.h(-2.0f, true, new a30());
                ox6 ox6VarQ3 = ir9.q(ox6Var2);
                ny8VarA = ly8.a(hVar3, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarQ3);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                qq2Var = null;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(700807476);
                i7 = 0;
                while (r4.hasNext()) {
                    i8 = i7 + 1;
                    if (i7 >= 0) {
                        ?? r22 = qq2Var;
                        ws0.m();
                        throw r22;
                    }
                    avatarWrapper = (AvatarWrapper) obj;
                    if (i7 == 0) {
                        AvatarShape shape7 = avatarWrapper.getAvatar().getShape();
                        shape7.getClass();
                        overlappedAvatarShape = AvatarIconKt.getComposeShape(shape7);
                    } else {
                        AvatarShape shape8 = list.get(i7 - 1).getAvatar().getShape();
                        shape8.getClass();
                        zx8 composeShape3 = AvatarIconKt.getComposeShape(shape8);
                        AvatarShape shape9 = avatarWrapper.getAvatar().getShape();
                        shape9.getClass();
                        overlappedAvatarShape = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape9), composeShape3, 4.0f, qq2Var);
                    }
                    AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), avatarWrapper, overlappedAvatarShape, false, j3, null, bj4VarO, 57344 & (i3 << 3), 40);
                    qq2Var = qq2Var;
                    i7 = i8;
                    aVar = aVar;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ox6 ox6Var6 = ox6Var2;
                f4 = f3;
                ox6Var3 = ox6Var6;
                j4 = j3;
            } else {
                bj4VarO.v0();
                i6 = i & 1;
                aVar = ox6.a.t;
                if (i6 != 0) {
                    if (i9 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        f3 = 38.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    } else {
                        j3 = j2;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        f3 = 38.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    } else {
                        j3 = j2;
                    }
                }
                bj4VarO.V();
                c30.h hVar4 = new c30.h(-2.0f, true, new a30());
                ox6 ox6VarQ4 = ir9.q(ox6Var2);
                ny8VarA = ly8.a(hVar4, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarQ4);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                qq2Var = null;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(700807476);
                i7 = 0;
                while (r4.hasNext()) {
                    i8 = i7 + 1;
                    if (i7 >= 0) {
                        ?? r23 = qq2Var;
                        ws0.m();
                        throw r23;
                    }
                    avatarWrapper = (AvatarWrapper) obj;
                    if (i7 == 0) {
                        AvatarShape shape10 = avatarWrapper.getAvatar().getShape();
                        shape10.getClass();
                        overlappedAvatarShape = AvatarIconKt.getComposeShape(shape10);
                    } else {
                        AvatarShape shape11 = list.get(i7 - 1).getAvatar().getShape();
                        shape11.getClass();
                        zx8 composeShape4 = AvatarIconKt.getComposeShape(shape11);
                        AvatarShape shape12 = avatarWrapper.getAvatar().getShape();
                        shape12.getClass();
                        overlappedAvatarShape = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape12), composeShape4, 4.0f, qq2Var);
                    }
                    AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), avatarWrapper, overlappedAvatarShape, false, j3, null, bj4VarO, 57344 & (i3 << 3), 40);
                    qq2Var = qq2Var;
                    i7 = i8;
                    aVar = aVar;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ox6 ox6Var7 = ox6Var2;
                f4 = f3;
                ox6Var3 = ox6Var7;
                j4 = j3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: uf0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AvatarGroupKt.AvatarGroup__J8mCjc$lambda$2(list, ox6Var3, f4, j4, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                f2 = f;
                if (bj4VarO.g(f2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (bj4VarO.i(j2)) {
                    }
                    i3 |= i10;
                } else {
                    j2 = j;
                }
                i3 |= i10;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) == 1170) {
                bj4VarO.v0();
                i6 = i & 1;
                aVar = ox6.a.t;
                if (i6 != 0) {
                    if (i9 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        f3 = 38.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    } else {
                        j3 = j2;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        f3 = 38.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    } else {
                        j3 = j2;
                    }
                }
                bj4VarO.V();
                c30.h hVar5 = new c30.h(-2.0f, true, new a30());
                ox6 ox6VarQ5 = ir9.q(ox6Var2);
                ny8VarA = ly8.a(hVar5, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarQ5);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                qq2Var = null;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(700807476);
                i7 = 0;
                while (r4.hasNext()) {
                    i8 = i7 + 1;
                    if (i7 >= 0) {
                        ?? r24 = qq2Var;
                        ws0.m();
                        throw r24;
                    }
                    avatarWrapper = (AvatarWrapper) obj;
                    if (i7 == 0) {
                        AvatarShape shape13 = avatarWrapper.getAvatar().getShape();
                        shape13.getClass();
                        overlappedAvatarShape = AvatarIconKt.getComposeShape(shape13);
                    } else {
                        AvatarShape shape14 = list.get(i7 - 1).getAvatar().getShape();
                        shape14.getClass();
                        zx8 composeShape5 = AvatarIconKt.getComposeShape(shape14);
                        AvatarShape shape15 = avatarWrapper.getAvatar().getShape();
                        shape15.getClass();
                        overlappedAvatarShape = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape15), composeShape5, 4.0f, qq2Var);
                    }
                    AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), avatarWrapper, overlappedAvatarShape, false, j3, null, bj4VarO, 57344 & (i3 << 3), 40);
                    qq2Var = qq2Var;
                    i7 = i8;
                    aVar = aVar;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ox6 ox6Var8 = ox6Var2;
                f4 = f3;
                ox6Var3 = ox6Var8;
                j4 = j3;
            } else {
                bj4VarO.v0();
                i6 = i & 1;
                aVar = ox6.a.t;
                if (i6 != 0) {
                    if (i9 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        f3 = 38.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    } else {
                        j3 = j2;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        f3 = 38.0f;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    } else {
                        j3 = j2;
                    }
                }
                bj4VarO.V();
                c30.h hVar6 = new c30.h(-2.0f, true, new a30());
                ox6 ox6VarQ6 = ir9.q(ox6Var2);
                ny8VarA = ly8.a(hVar6, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarQ6);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                qq2Var = null;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(700807476);
                i7 = 0;
                while (r4.hasNext()) {
                    i8 = i7 + 1;
                    if (i7 >= 0) {
                        ?? r25 = qq2Var;
                        ws0.m();
                        throw r25;
                    }
                    avatarWrapper = (AvatarWrapper) obj;
                    if (i7 == 0) {
                        AvatarShape shape16 = avatarWrapper.getAvatar().getShape();
                        shape16.getClass();
                        overlappedAvatarShape = AvatarIconKt.getComposeShape(shape16);
                    } else {
                        AvatarShape shape17 = list.get(i7 - 1).getAvatar().getShape();
                        shape17.getClass();
                        zx8 composeShape6 = AvatarIconKt.getComposeShape(shape17);
                        AvatarShape shape18 = avatarWrapper.getAvatar().getShape();
                        shape18.getClass();
                        overlappedAvatarShape = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape18), composeShape6, 4.0f, qq2Var);
                    }
                    AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), avatarWrapper, overlappedAvatarShape, false, j3, null, bj4VarO, 57344 & (i3 << 3), 40);
                    qq2Var = qq2Var;
                    i7 = i8;
                    aVar = aVar;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ox6 ox6Var9 = ox6Var2;
                f4 = f3;
                ox6Var3 = ox6Var9;
                j4 = j3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: uf0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AvatarGroupKt.AvatarGroup__J8mCjc$lambda$2(list, ox6Var3, f4, j4, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        f2 = f;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j2 = j;
                if (bj4VarO.i(j2)) {
                }
                i3 |= i10;
            } else {
                j2 = j;
            }
            i3 |= i10;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) == 1170) {
            bj4VarO.v0();
            i6 = i & 1;
            aVar = ox6.a.t;
            if (i6 != 0) {
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    f3 = 38.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                } else {
                    j3 = j2;
                }
            } else {
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    f3 = 38.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                } else {
                    j3 = j2;
                }
            }
            bj4VarO.V();
            c30.h hVar7 = new c30.h(-2.0f, true, new a30());
            ox6 ox6VarQ7 = ir9.q(ox6Var2);
            ny8VarA = ly8.a(hVar7, di.a.j, bj4VarO, 6);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarQ7);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            qq2Var = null;
            if (bj4VarO.a != null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(700807476);
            i7 = 0;
            while (r4.hasNext()) {
                i8 = i7 + 1;
                if (i7 >= 0) {
                    ?? r26 = qq2Var;
                    ws0.m();
                    throw r26;
                }
                avatarWrapper = (AvatarWrapper) obj;
                if (i7 == 0) {
                    AvatarShape shape19 = avatarWrapper.getAvatar().getShape();
                    shape19.getClass();
                    overlappedAvatarShape = AvatarIconKt.getComposeShape(shape19);
                } else {
                    AvatarShape shape110 = list.get(i7 - 1).getAvatar().getShape();
                    shape110.getClass();
                    zx8 composeShape7 = AvatarIconKt.getComposeShape(shape110);
                    AvatarShape shape111 = avatarWrapper.getAvatar().getShape();
                    shape111.getClass();
                    overlappedAvatarShape = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape111), composeShape7, 4.0f, qq2Var);
                }
                AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), avatarWrapper, overlappedAvatarShape, false, j3, null, bj4VarO, 57344 & (i3 << 3), 40);
                qq2Var = qq2Var;
                i7 = i8;
                aVar = aVar;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6 ox6Var10 = ox6Var2;
            f4 = f3;
            ox6Var3 = ox6Var10;
            j4 = j3;
        } else {
            bj4VarO.v0();
            i6 = i & 1;
            aVar = ox6.a.t;
            if (i6 != 0) {
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    f3 = 38.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                } else {
                    j3 = j2;
                }
            } else {
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    f3 = 38.0f;
                } else {
                    f3 = f2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    j3 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                } else {
                    j3 = j2;
                }
            }
            bj4VarO.V();
            c30.h hVar8 = new c30.h(-2.0f, true, new a30());
            ox6 ox6VarQ8 = ir9.q(ox6Var2);
            ny8VarA = ly8.a(hVar8, di.a.j, bj4VarO, 6);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarQ8);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            qq2Var = null;
            if (bj4VarO.a != null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(700807476);
            i7 = 0;
            while (r4.hasNext()) {
                i8 = i7 + 1;
                if (i7 >= 0) {
                    ?? r27 = qq2Var;
                    ws0.m();
                    throw r27;
                }
                avatarWrapper = (AvatarWrapper) obj;
                if (i7 == 0) {
                    AvatarShape shape112 = avatarWrapper.getAvatar().getShape();
                    shape112.getClass();
                    overlappedAvatarShape = AvatarIconKt.getComposeShape(shape112);
                } else {
                    AvatarShape shape113 = list.get(i7 - 1).getAvatar().getShape();
                    shape113.getClass();
                    zx8 composeShape8 = AvatarIconKt.getComposeShape(shape113);
                    AvatarShape shape114 = avatarWrapper.getAvatar().getShape();
                    shape114.getClass();
                    overlappedAvatarShape = new OverlappedAvatarShape(AvatarIconKt.getComposeShape(shape114), composeShape8, 4.0f, qq2Var);
                }
                AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), avatarWrapper, overlappedAvatarShape, false, j3, null, bj4VarO, 57344 & (i3 << 3), 40);
                qq2Var = qq2Var;
                i7 = i8;
                aVar = aVar;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6 ox6Var11 = ox6Var2;
            f4 = f3;
            ox6Var3 = ox6Var11;
            j4 = j3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: uf0
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AvatarGroupKt.AvatarGroup__J8mCjc$lambda$2(list, ox6Var3, f4, j4, i, i2, (jt1) obj2, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void AvatarGroupPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-2091006176);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarGroupKt.INSTANCE.m22getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: wf0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarGroupKt.AvatarGroupPreview$lambda$3(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarGroupPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        AvatarGroupPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void AvatarGroupWithMixedShapesPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1253949399);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarGroupKt.INSTANCE.m23getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vf0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarGroupKt.AvatarGroupWithMixedShapesPreview$lambda$4(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarGroupWithMixedShapesPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        AvatarGroupWithMixedShapesPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarGroup__J8mCjc$lambda$2(List list, ox6 ox6Var, float f, long j, int i, int i2, jt1 jt1Var, int i3) {
        m19AvatarGroupJ8mCjc(list, ox6Var, f, j, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
