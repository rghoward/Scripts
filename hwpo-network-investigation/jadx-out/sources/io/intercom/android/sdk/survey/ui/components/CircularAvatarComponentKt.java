package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.ad1;
import defpackage.al8;
import defpackage.ay8;
import defpackage.b85;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.e;
import defpackage.ec9;
import defpackage.ed1;
import defpackage.eva;
import defpackage.f50;
import defpackage.fd1;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.hc9;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.k50;
import defpackage.k85;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.l02;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.nz1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.pb9;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.u30;
import defpackage.uh1;
import defpackage.uma;
import defpackage.wq0;
import defpackage.xj8;
import defpackage.y0a;
import defpackage.z75;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CircularAvatarComponentKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x014b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0194  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x0224  */
    /* JADX WARN: Code duplicated, block: B:75:0x027f  */
    /* JADX WARN: Code duplicated, block: B:79:0x028d  */
    /* JADX WARN: Code duplicated, block: B:81:0x029d  */
    /* JADX WARN: Code duplicated, block: B:83:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: CircularAvatar-aM-cp0Q, reason: not valid java name */
    public static final void m451CircularAvataraMcp0Q(final Avatar avatar, final long j, float f, jt1 jt1Var, final int i, final int i2) {
        Avatar avatar2;
        int i3;
        float f2;
        float f3;
        sp0 sp0Var;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6.a aVar;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        final String strF;
        int length;
        al8.a aVar3;
        sp0 sp0Var2;
        kv0 kv0Var;
        float f4;
        ox6.a aVar4;
        fl6 fl6VarD2;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        final float f5;
        String str;
        String imageUrl;
        boolean z;
        float f6;
        fl6 fl6VarD3;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        boolean zJ;
        Object objF;
        xj8 xj8VarW;
        avatar.getClass();
        bj4 bj4VarO = jt1Var.o(-276383091);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            avatar2 = avatar;
        } else if ((i & 6) == 0) {
            avatar2 = avatar;
            i3 = (bj4VarO.j(avatar2) ? 4 : 2) | i;
        } else {
            avatar2 = avatar;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.i(j) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                f2 = f;
                i3 |= bj4VarO.g(f2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                if (i4 != 0) {
                    f3 = 40.0f;
                } else {
                    f3 = f2;
                }
                sp0Var = di.a.a;
                fl6VarD = dv0.d(sp0Var, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, fl6VarD);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                strF = nr1.f(bj4VarO, R.string.intercom_surveys_sender_image);
                String initials = avatar2.getInitials();
                initials.getClass();
                length = initials.length();
                aVar3 = al8.a;
                sp0Var2 = di.a.e;
                kv0Var = kv0.a;
                if (length > 0) {
                    bj4VarO.K(-2071598305);
                    f6 = f3;
                    ox6 ox6VarC4 = gi0.c(uma.a(ir9.j(aVar, f3), ay8.a), j, aVar3);
                    fl6VarD3 = dv0.d(sp0Var, false);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarC4);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD3);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    String initials2 = avatar.getInitials();
                    initials2.getClass();
                    ox6 ox6VarF = kv0Var.f(aVar, sp0Var2);
                    bj4VarO.K(592336280);
                    zJ = bj4VarO.J(strF);
                    objF = bj4VarO.f();
                    if (zJ || objF == jt1.a.a) {
                        objF = new oh4() { // from class: cd1
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(strF, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    aVar4 = aVar;
                    mia.b(initials2, pb9.b(ox6VarF, false, (oh4) objF), ColorExtensionsKt.m833generateTextColor8_81llA(j), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, 0, 0, 262136);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                    str = strF;
                    f5 = f6;
                } else {
                    f4 = f3;
                    aVar4 = aVar;
                    bj4VarO.K(-2071004283);
                    ox6 ox6VarC5 = gi0.c(uma.a(ir9.j(aVar4, f4), ay8.a), j, aVar3);
                    fl6VarD2 = dv0.d(sp0Var, false);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC5);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD2);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    f5 = f4;
                    z75.a(is7.a(R.drawable.intercom_default_avatar_icon, bj4VarO, 0), strF, kv0Var.f(aVar4, sp0Var2), null, nz1.a.a, 0.0f, new wq0(5, ColorExtensionsKt.m833generateTextColor8_81llA(j)), bj4VarO, 24584, 40);
                    str = strF;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                bj4VarO.K(-1313708522);
                imageUrl = avatar.getImageUrl();
                imageUrl.getClass();
                if (imageUrl.length() > 0) {
                    String imageUrl2 = avatar.getImageUrl();
                    y0a y0aVar = AndroidCompositionLocals_androidKt.b;
                    b85 imageLoader = IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(y0aVar));
                    bj4VarO.e(1750824323);
                    k85.a aVar5 = new k85.a((Context) bj4VarO.F(y0aVar));
                    aVar5.c = imageUrl2;
                    aVar5.b();
                    z = false;
                    aVar5.i = e.a(u30.E(new eva[]{new ad1()}));
                    f50 f50VarA = k50.a(aVar5.a(), imageLoader, null, null, bj4VarO, 124);
                    bj4VarO.U(false);
                    z75.a(f50VarA, str, ir9.j(aVar4, f5), null, null, 0.0f, null, bj4VarO, 0, 120);
                } else {
                    z = false;
                }
                bj4VarO.U(z);
                bj4VarO.U(true);
            } else {
                bj4VarO.u();
                f5 = f2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: dd1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$6(avatar, j, f5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        f2 = f;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
                f3 = 40.0f;
            } else {
                f3 = f2;
            }
            sp0Var = di.a.a;
            fl6VarD = dv0.d(sp0Var, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            aVar = ox6.a.t;
            ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, fl6VarD);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf2);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            strF = nr1.f(bj4VarO, R.string.intercom_surveys_sender_image);
            String initials3 = avatar2.getInitials();
            initials3.getClass();
            length = initials3.length();
            aVar3 = al8.a;
            sp0Var2 = di.a.e;
            kv0Var = kv0.a;
            if (length > 0) {
                bj4VarO.K(-2071598305);
                f6 = f3;
                ox6 ox6VarC6 = gi0.c(uma.a(ir9.j(aVar, f3), ay8.a), j, aVar3);
                fl6VarD3 = dv0.d(sp0Var, false);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarC6);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD3);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                String initials4 = avatar.getInitials();
                initials4.getClass();
                ox6 ox6VarF2 = kv0Var.f(aVar, sp0Var2);
                bj4VarO.K(592336280);
                zJ = bj4VarO.J(strF);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new oh4() { // from class: cd1
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(strF, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: cd1
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(strF, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                aVar4 = aVar;
                mia.b(initials4, pb9.b(ox6VarF2, false, (oh4) objF), ColorExtensionsKt.m833generateTextColor8_81llA(j), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, 0, 0, 262136);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(false);
                str = strF;
                f5 = f6;
            } else {
                f4 = f3;
                aVar4 = aVar;
                bj4VarO.K(-2071004283);
                ox6 ox6VarC7 = gi0.c(uma.a(ir9.j(aVar4, f4), ay8.a), j, aVar3);
                fl6VarD2 = dv0.d(sp0Var, false);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC7);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD2);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                f5 = f4;
                z75.a(is7.a(R.drawable.intercom_default_avatar_icon, bj4VarO, 0), strF, kv0Var.f(aVar4, sp0Var2), null, nz1.a.a, 0.0f, new wq0(5, ColorExtensionsKt.m833generateTextColor8_81llA(j)), bj4VarO, 24584, 40);
                str = strF;
                bj4VarO.U(true);
                bj4VarO.U(false);
            }
            bj4VarO.K(-1313708522);
            imageUrl = avatar.getImageUrl();
            imageUrl.getClass();
            if (imageUrl.length() > 0) {
                String imageUrl3 = avatar.getImageUrl();
                y0a y0aVar2 = AndroidCompositionLocals_androidKt.b;
                b85 imageLoader2 = IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(y0aVar2));
                bj4VarO.e(1750824323);
                k85.a aVar6 = new k85.a((Context) bj4VarO.F(y0aVar2));
                aVar6.c = imageUrl3;
                aVar6.b();
                z = false;
                aVar6.i = e.a(u30.E(new eva[]{new ad1()}));
                f50 f50VarA2 = k50.a(aVar6.a(), imageLoader2, null, null, bj4VarO, 124);
                bj4VarO.U(false);
                z75.a(f50VarA2, str, ir9.j(aVar4, f5), null, null, 0.0f, null, bj4VarO, 0, 120);
            } else {
                z = false;
            }
            bj4VarO.U(z);
            bj4VarO.U(true);
        } else {
            if (i4 != 0) {
                f3 = 40.0f;
            } else {
                f3 = f2;
            }
            sp0Var = di.a.a;
            fl6VarD = dv0.d(sp0Var, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            aVar = ox6.a.t;
            ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, fl6VarD);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf3);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            strF = nr1.f(bj4VarO, R.string.intercom_surveys_sender_image);
            String initials5 = avatar2.getInitials();
            initials5.getClass();
            length = initials5.length();
            aVar3 = al8.a;
            sp0Var2 = di.a.e;
            kv0Var = kv0.a;
            if (length > 0) {
                bj4VarO.K(-2071598305);
                f6 = f3;
                ox6 ox6VarC8 = gi0.c(uma.a(ir9.j(aVar, f3), ay8.a), j, aVar3);
                fl6VarD3 = dv0.d(sp0Var, false);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarC8);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD3);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                String initials6 = avatar.getInitials();
                initials6.getClass();
                ox6 ox6VarF3 = kv0Var.f(aVar, sp0Var2);
                bj4VarO.K(592336280);
                zJ = bj4VarO.J(strF);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new oh4() { // from class: cd1
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(strF, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: cd1
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(strF, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                aVar4 = aVar;
                mia.b(initials6, pb9.b(ox6VarF3, false, (oh4) objF), ColorExtensionsKt.m833generateTextColor8_81llA(j), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, 0, 0, 262136);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(false);
                str = strF;
                f5 = f6;
            } else {
                f4 = f3;
                aVar4 = aVar;
                bj4VarO.K(-2071004283);
                ox6 ox6VarC9 = gi0.c(uma.a(ir9.j(aVar4, f4), ay8.a), j, aVar3);
                fl6VarD2 = dv0.d(sp0Var, false);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC9);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD2);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                f5 = f4;
                z75.a(is7.a(R.drawable.intercom_default_avatar_icon, bj4VarO, 0), strF, kv0Var.f(aVar4, sp0Var2), null, nz1.a.a, 0.0f, new wq0(5, ColorExtensionsKt.m833generateTextColor8_81llA(j)), bj4VarO, 24584, 40);
                str = strF;
                bj4VarO.U(true);
                bj4VarO.U(false);
            }
            bj4VarO.K(-1313708522);
            imageUrl = avatar.getImageUrl();
            imageUrl.getClass();
            if (imageUrl.length() > 0) {
                String imageUrl4 = avatar.getImageUrl();
                y0a y0aVar3 = AndroidCompositionLocals_androidKt.b;
                b85 imageLoader3 = IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(y0aVar3));
                bj4VarO.e(1750824323);
                k85.a aVar7 = new k85.a((Context) bj4VarO.F(y0aVar3));
                aVar7.c = imageUrl4;
                aVar7.b();
                z = false;
                aVar7.i = e.a(u30.E(new eva[]{new ad1()}));
                f50 f50VarA3 = k50.a(aVar7.a(), imageLoader3, null, null, bj4VarO, 124);
                bj4VarO.U(false);
                z75.a(f50VarA3, str, ir9.j(aVar4, f5), null, null, 0.0f, null, bj4VarO, 0, 120);
            } else {
                z = false;
            }
            bj4VarO.U(z);
            bj4VarO.U(true);
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: dd1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CircularAvatarComponentKt.CircularAvatar_aM_cp0Q$lambda$6(avatar, j, f5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CircularAvatar_aM_cp0Q$lambda$5$lambda$2$lambda$1$lambda$0(String str, hc9 hc9Var) {
        hc9Var.getClass();
        ec9.b(str, hc9Var);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CircularAvatar_aM_cp0Q$lambda$6(Avatar avatar, long j, float f, int i, int i2, jt1 jt1Var, int i3) {
        m451CircularAvataraMcp0Q(avatar, j, f, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void PreviewDefaultAvatar(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1706634993);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
            avatarCreate.getClass();
            m451CircularAvataraMcp0Q(avatarCreate, uh1.i, 0.0f, bj4VarO, 48, 4);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ed1(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewDefaultAvatar$lambda$7(int i, jt1 jt1Var, int i2) {
        PreviewDefaultAvatar(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void PreviewInitialAvatar(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1788709612);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "PS");
            avatarCreate.getClass();
            m451CircularAvataraMcp0Q(avatarCreate, uh1.h, 0.0f, bj4VarO, 48, 4);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new fd1(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewInitialAvatar$lambda$8(int i, jt1 jt1Var, int i2) {
        PreviewInitialAvatar(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
