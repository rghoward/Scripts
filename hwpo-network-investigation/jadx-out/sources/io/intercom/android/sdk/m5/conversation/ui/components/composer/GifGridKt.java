package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import com.intercom.twig.BuildConfig;
import defpackage.a30;
import defpackage.aa0;
import defpackage.aj1;
import defpackage.ap5;
import defpackage.az9;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bp5;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.d16;
import defpackage.di;
import defpackage.dp5;
import defpackage.eb2;
import defpackage.ei4;
import defpackage.em0;
import defpackage.eo7;
import defpackage.f10;
import defpackage.fi4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h27;
import defpackage.h37;
import defpackage.i27;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.ko7;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ojb;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.qu1;
import defpackage.raa;
import defpackage.rd7;
import defpackage.t06;
import defpackage.t16;
import defpackage.uh1;
import defpackage.we1;
import defpackage.wja;
import defpackage.xda;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.xv9;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.block.ImageBlockKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class GifGridKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0340  */
    /* JADX WARN: Code duplicated, block: B:104:0x0356  */
    /* JADX WARN: Code duplicated, block: B:107:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:108:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:114:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0321  */
    /* JADX WARN: Code duplicated, block: B:96:0x0333  */
    /* JADX WARN: Code duplicated, block: B:97:0x0335  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void GifGrid(ox6 ox6Var, final List<? extends Block> list, oh4<? super Block, g2b> oh4Var, final oh4<? super String, g2b> oh4Var2, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        bt1.a.b bVar;
        bt1.a.d dVar;
        bt1.a.c cVar;
        int i4;
        ox6.a aVar;
        bt1.a.e eVar;
        jt1.a.C0187a c0187a;
        h27 h27Var;
        xv9 xv9Var;
        ox6 ox6Var3;
        qr5.a aVar2;
        bj4 bj4Var;
        boolean z;
        jt1.a.C0187a c0187a2;
        int i5;
        int i6;
        boolean z2;
        Object objF;
        final h37 h37Var;
        final h37 h37Var2;
        jt1.a.C0187a c0187a3;
        bj4 bj4Var2;
        jt1.a.C0187a c0187a4;
        boolean z3;
        boolean z4;
        Object objF2;
        final oh4<? super Block, g2b> oh4Var3;
        bj4 bj4Var3;
        final ox6 ox6Var4;
        boolean z5;
        Object objF3;
        list.getClass();
        oh4Var.getClass();
        oh4Var2.getClass();
        bj4 bj4VarO = jt1Var.o(2027814826);
        j1b j1bVar = bj4VarO.a;
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(oh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var3 = bj4VarO;
            oh4Var3 = oh4Var;
            ox6Var4 = ox6Var2;
        } else {
            ox6.a aVar3 = ox6.a.t;
            if (i7 != 0) {
                ox6Var2 = aVar3;
            }
            bj4VarO.K(-1549192846);
            Object objF4 = bj4VarO.f();
            jt1.a.C0187a c0187a5 = jt1.a.a;
            if (objF4 == c0187a5) {
                objF4 = bl7.i(BuildConfig.FLAVOR);
                bj4VarO.C(objF4);
            }
            h37 h37Var3 = (h37) objF4;
            Object objB = aa0.b(bj4VarO, false, -1549190918);
            if (objB == c0187a5) {
                objB = new i27();
                bj4VarO.C(objB);
            }
            h27 h27Var2 = (h27) objB;
            bj4VarO.U(false);
            xv9 xv9Var2 = (xv9) bj4VarO.F(qu1.q);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, aVar3);
            bt1.c.getClass();
            qr5.a aVar4 = bt1.a.b;
            ox6 ox6Var5 = ox6Var2;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar4);
            } else {
                bj4VarO.z();
            }
            bt1.a.c cVar2 = bt1.a.f;
            rd7.d(bj4VarO, cVar2, aj1VarA);
            bt1.a.e eVar2 = bt1.a.e;
            rd7.d(bj4VarO, eVar2, kw7VarP);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar2 = bt1.a.g;
            rd7.d(bj4VarO, bVar2, numValueOf);
            bt1.a.C0034a c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            bt1.a.d dVar2 = bt1.a.d;
            rd7.d(bj4VarO, dVar2, ox6VarC);
            bj4VarO.K(-1834338565);
            if (xj5.a(h37Var3.getValue(), "intercom version")) {
                cVar = cVar2;
                aVar = aVar3;
                bVar = bVar2;
                h27Var = h27Var2;
                c0187a = c0187a5;
                dVar = dVar2;
                xv9Var = xv9Var2;
                ox6Var3 = ox6Var5;
                aVar2 = aVar4;
                i4 = i3;
                eVar = eVar2;
                z = false;
                mia.b(io.intercom.android.sdk.BuildConfig.VERSION_NAME, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, 6, 0, 262142);
                bj4Var = bj4VarO;
            } else {
                bVar = bVar2;
                dVar = dVar2;
                cVar = cVar2;
                i4 = i3;
                aVar = aVar3;
                eVar = eVar2;
                c0187a = c0187a5;
                h27Var = h27Var2;
                xv9Var = xv9Var2;
                ox6Var3 = ox6Var5;
                aVar2 = aVar4;
                bj4Var = bj4VarO;
                z = false;
            }
            bj4Var.U(z);
            ox6.a aVar5 = aVar;
            ox6 ox6VarK = eo7.k(ir9.c(aVar5, 1.0f), 8.0f, 0.0f, 2);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i8 = IntercomTheme.$stable;
            ox6 ox6VarJ = eo7.j(8.0f, 12.0f, gi0.c(ox6VarK, uh1.b(0.05f, intercomTheme.getColors(bj4Var, i8).getText().m824getDefault0d7_KjU()), intercomTheme.getShapes(bj4Var, i8).b));
            ny8 ny8VarA = ly8.a(c30.a, di.a.k, bj4Var, 48);
            int iHashCode2 = Long.hashCode(bj4Var.T);
            kw7 kw7VarP2 = bj4Var.P();
            ox6 ox6VarC2 = it1.c(bj4Var, ox6VarJ);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4Var.q();
            if (bj4Var.S) {
                bj4Var.k(aVar2);
            } else {
                bj4Var.z();
            }
            rd7.d(bj4Var, cVar, ny8VarA);
            rd7.d(bj4Var, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4Var, bVar, bj4Var, c0034a);
            rd7.d(bj4Var, dVar, ox6VarC2);
            String str = (String) h37Var3.getValue();
            wja wjaVarA = wja.a(intercomTheme.getTypography(bj4Var, i8).getType04(), gh5.a(intercomTheme, bj4Var, i8), 0L, null, null, 0L, 0L, null, null, 16777214);
            int i9 = 1;
            qs5 qs5Var = new qs5(true, 1.0f);
            dp5 dp5Var = dp5.e;
            dp5 dp5Var2 = new dp5(dp5Var.a, dp5Var.b, dp5Var.c, 3);
            bj4Var.K(-1582273669);
            final xv9 xv9Var3 = xv9Var;
            boolean zJ = bj4Var.J(xv9Var3);
            Object objF5 = bj4Var.f();
            if (zJ) {
                c0187a2 = c0187a;
            } else {
                c0187a2 = c0187a;
                if (objF5 == c0187a2) {
                }
                bj4Var.U(z);
                bp5 bp5Var = new bp5(null, (oh4) objF5, 47);
                bj4Var.K(-1582286115);
                i5 = i4;
                i6 = i5 & 7168;
                if (i6 == 2048) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                objF = bj4Var.f();
                if (!z2 || objF == c0187a2) {
                    h37Var = h37Var3;
                    objF = new eb2(i9, h37Var, oh4Var2);
                    bj4Var.C(objF);
                } else {
                    h37Var = h37Var3;
                }
                bj4Var.U(z);
                final h27 h27Var3 = h27Var;
                fr1 fr1VarB = gr1.b(1827261249, new ei4<ci4<? super jt1, ? super Integer, ? extends g2b>, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$1$1$3
                    public final void invoke(ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var2, int i10) {
                        jt1 jt1Var3;
                        int i11;
                        ci4Var.getClass();
                        if ((i10 & 6) == 0) {
                            jt1Var3 = jt1Var2;
                            i11 = i10 | (jt1Var3.j(ci4Var) ? 4 : 2);
                        } else {
                            jt1Var3 = jt1Var2;
                            i11 = i10;
                        }
                        if ((i11 & 19) == 18 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        String value = h37Var.getValue();
                        ko7 ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        long j = uh1.j;
                        xda.a.b(value, ci4Var, true, true, ojb.a.a, h27Var3, ComposableSingletons$GifGridKt.INSTANCE.m160getLambda1$intercom_sdk_base_release(), null, null, null, xda.c(0L, 0L, 0L, j, j, 0L, 0L, j, j, 0L, jt1Var3, 2147477455), ko7Var, null, jt1Var2, ((i11 << 3) & 112) | 100887936, 102236160, 163520);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(ci4<? super jt1, ? super Integer, ? extends g2b> ci4Var, jt1 jt1Var2, Integer num) {
                        invoke((ci4<? super jt1, ? super Integer, g2b>) ci4Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4Var);
                h37Var2 = h37Var;
                c0187a3 = c0187a2;
                bj4Var2 = bj4Var;
                em0.b(str, (oh4) objF, qs5Var, false, false, wjaVarA, dp5Var2, bp5Var, true, 0, 0, null, null, null, null, fr1VarB, bj4Var2, 100663296, 196608, 32280);
                b47.b(bj4Var2, ir9.n(aVar5, 8.0f));
                if (((CharSequence) h37Var2.getValue()).length() > 0) {
                    bj4Var2.K(-1804446466);
                    int i10 = R.drawable.intercom_close;
                    bj4Var2.K(-1582226851);
                    if (i6 == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objF3 = bj4Var2.f();
                    c0187a4 = c0187a3;
                    if (z5 || objF3 == c0187a4) {
                        objF3 = new mh4() { // from class: gm4
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return GifGridKt.GifGrid$lambda$12$lambda$8$lambda$7$lambda$6(h37Var2, oh4Var2);
                            }
                        };
                        bj4Var2.C(objF3);
                    }
                    bj4Var2.U(false);
                    GifGridIcon(i10, (mh4) objF3, bj4Var2, 0, 0);
                    bj4Var2.U(false);
                } else {
                    c0187a4 = c0187a3;
                    bj4Var2.K(-1804266015);
                    GifGridIcon(R.drawable.intercom_gif_search_icon, null, bj4Var2, 0, 2);
                    bj4Var2.U(false);
                }
                bj4Var2.U(true);
                b47.b(bj4Var2, ir9.d(aVar5, 4.0f));
                ox6 ox6Var6 = ox6Var3;
                ox6 ox6VarC3 = ir9.c(ox6Var6, 1.0f);
                az9.a aVar6 = new az9.a();
                ko7 ko7Var = new ko7(8.0f, 8.0f, 8.0f, 8.0f);
                c30.h hVar = new c30.h(8.0f, true, new a30());
                bj4Var2.K(-1834236811);
                boolean zJ2 = bj4Var2.j(list);
                if ((i5 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zJ2 | z3;
                objF2 = bj4Var2.f();
                if (!z4 || objF2 == c0187a4) {
                    oh4Var3 = oh4Var;
                    objF2 = new oh4() { // from class: hm4
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return GifGridKt.GifGrid$lambda$12$lambda$11$lambda$10(list, oh4Var3, (t16) obj);
                        }
                    };
                    bj4Var2.C(objF2);
                } else {
                    oh4Var3 = oh4Var;
                }
                bj4Var2.U(false);
                t06.a(aVar6, ox6VarC3, null, ko7Var, 8.0f, hVar, null, false, null, (oh4) objF2, bj4Var2, 1772544);
                bj4Var3 = bj4Var2;
                bj4Var3.U(true);
                ox6Var4 = ox6Var6;
            }
            objF5 = new oh4() { // from class: fm4
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return GifGridKt.GifGrid$lambda$12$lambda$8$lambda$3$lambda$2(xv9Var3, (ap5) obj);
                }
            };
            bj4Var.C(objF5);
            bj4Var.U(z);
            bp5 bp5Var2 = new bp5(null, (oh4) objF5, 47);
            bj4Var.K(-1582286115);
            i5 = i4;
            i6 = i5 & 7168;
            if (i6 == 2048) {
                z2 = true;
            } else {
                z2 = z;
            }
            objF = bj4Var.f();
            if (z2) {
                h37Var = h37Var3;
                objF = new eb2(i9, h37Var, oh4Var2);
                bj4Var.C(objF);
            } else {
                h37Var = h37Var3;
                objF = new eb2(i9, h37Var, oh4Var2);
                bj4Var.C(objF);
            }
            bj4Var.U(z);
            final h27 h27Var4 = h27Var;
            fr1 fr1VarB2 = gr1.b(1827261249, new ei4<ci4<? super jt1, ? super Integer, ? extends g2b>, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$1$1$3
                public final void invoke(ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var2, int i11) {
                    jt1 jt1Var3;
                    int i12;
                    ci4Var.getClass();
                    if ((i11 & 6) == 0) {
                        jt1Var3 = jt1Var2;
                        i12 = i11 | (jt1Var3.j(ci4Var) ? 4 : 2);
                    } else {
                        jt1Var3 = jt1Var2;
                        i12 = i11;
                    }
                    if ((i12 & 19) == 18 && jt1Var3.r()) {
                        jt1Var3.u();
                        return;
                    }
                    String value = h37Var.getValue();
                    ko7 ko7Var2 = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    long j = uh1.j;
                    xda.a.b(value, ci4Var, true, true, ojb.a.a, h27Var4, ComposableSingletons$GifGridKt.INSTANCE.m160getLambda1$intercom_sdk_base_release(), null, null, null, xda.c(0L, 0L, 0L, j, j, 0L, 0L, j, j, 0L, jt1Var3, 2147477455), ko7Var2, null, jt1Var2, ((i12 << 3) & 112) | 100887936, 102236160, 163520);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(ci4<? super jt1, ? super Integer, ? extends g2b> ci4Var, jt1 jt1Var2, Integer num) {
                    invoke((ci4<? super jt1, ? super Integer, g2b>) ci4Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4Var);
            h37Var2 = h37Var;
            c0187a3 = c0187a2;
            bj4Var2 = bj4Var;
            em0.b(str, (oh4) objF, qs5Var, false, false, wjaVarA, dp5Var2, bp5Var2, true, 0, 0, null, null, null, null, fr1VarB2, bj4Var2, 100663296, 196608, 32280);
            b47.b(bj4Var2, ir9.n(aVar5, 8.0f));
            if (((CharSequence) h37Var2.getValue()).length() > 0) {
                bj4Var2.K(-1804446466);
                int i11 = R.drawable.intercom_close;
                bj4Var2.K(-1582226851);
                if (i6 == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objF3 = bj4Var2.f();
                c0187a4 = c0187a3;
                if (z5) {
                    objF3 = new mh4() { // from class: gm4
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return GifGridKt.GifGrid$lambda$12$lambda$8$lambda$7$lambda$6(h37Var2, oh4Var2);
                        }
                    };
                    bj4Var2.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: gm4
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return GifGridKt.GifGrid$lambda$12$lambda$8$lambda$7$lambda$6(h37Var2, oh4Var2);
                        }
                    };
                    bj4Var2.C(objF3);
                }
                bj4Var2.U(false);
                GifGridIcon(i11, (mh4) objF3, bj4Var2, 0, 0);
                bj4Var2.U(false);
            } else {
                c0187a4 = c0187a3;
                bj4Var2.K(-1804266015);
                GifGridIcon(R.drawable.intercom_gif_search_icon, null, bj4Var2, 0, 2);
                bj4Var2.U(false);
            }
            bj4Var2.U(true);
            b47.b(bj4Var2, ir9.d(aVar5, 4.0f));
            ox6 ox6Var7 = ox6Var3;
            ox6 ox6VarC4 = ir9.c(ox6Var7, 1.0f);
            az9.a aVar7 = new az9.a();
            ko7 ko7Var2 = new ko7(8.0f, 8.0f, 8.0f, 8.0f);
            c30.h hVar2 = new c30.h(8.0f, true, new a30());
            bj4Var2.K(-1834236811);
            boolean zJ3 = bj4Var2.j(list);
            if ((i5 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = zJ3 | z3;
            objF2 = bj4Var2.f();
            if (z4) {
                oh4Var3 = oh4Var;
                objF2 = new oh4() { // from class: hm4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return GifGridKt.GifGrid$lambda$12$lambda$11$lambda$10(list, oh4Var3, (t16) obj);
                    }
                };
                bj4Var2.C(objF2);
            } else {
                oh4Var3 = oh4Var;
                objF2 = new oh4() { // from class: hm4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return GifGridKt.GifGrid$lambda$12$lambda$11$lambda$10(list, oh4Var3, (t16) obj);
                    }
                };
                bj4Var2.C(objF2);
            }
            bj4Var2.U(false);
            t06.a(aVar7, ox6VarC4, null, ko7Var2, 8.0f, hVar2, null, false, null, (oh4) objF2, bj4Var2, 1772544);
            bj4Var3 = bj4Var2;
            bj4Var3.U(true);
            ox6Var4 = ox6Var7;
        }
        xj8 xj8VarW = bj4Var3.W();
        if (xj8VarW != null) {
            final oh4<? super Block, g2b> oh4Var4 = oh4Var3;
            xj8VarW.d = new ci4() { // from class: im4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return GifGridKt.GifGrid$lambda$13(ox6Var4, list, oh4Var4, oh4Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$2] */
    public static final g2b GifGrid$lambda$12$lambda$11$lambda$10(final List list, final oh4 oh4Var, t16 t16Var) {
        t16Var.getClass();
        t16Var.d(list.size(), new oh4<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$2
            @Override // defpackage.oh4
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, new fr1(true, -1466459515, new fi4<d16, Integer, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$4
            public final void invoke(d16 d16Var, int i, jt1 jt1Var, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (jt1Var.J(d16Var) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= jt1Var.h(i) ? 32 : 16;
                }
                if (!jt1Var.A(i3 & 1, (i3 & 147) != 146)) {
                    jt1Var.u();
                    return;
                }
                Block block = (Block) list.get(i);
                jt1Var.K(-700726808);
                ImageBlockKt.m439ImageBlockV9fs2A(block, null, oh4Var, true, null, 0L, jt1Var, 3072, 50);
                jt1Var.B();
            }

            @Override // defpackage.fi4
            public /* bridge */ /* synthetic */ g2b invoke(d16 d16Var, Integer num, jt1 jt1Var, Integer num2) {
                invoke(d16Var, num.intValue(), jt1Var, num2.intValue());
                return g2b.a;
            }
        }));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GifGrid$lambda$12$lambda$8$lambda$3$lambda$2(xv9 xv9Var, ap5 ap5Var) {
        ap5Var.getClass();
        if (xv9Var != null) {
            xv9Var.a();
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GifGrid$lambda$12$lambda$8$lambda$5$lambda$4(h37 h37Var, oh4 oh4Var, String str) {
        str.getClass();
        h37Var.setValue(str);
        oh4Var.invoke(str);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GifGrid$lambda$12$lambda$8$lambda$7$lambda$6(h37 h37Var, oh4 oh4Var) {
        h37Var.setValue(BuildConfig.FLAVOR);
        oh4Var.invoke(BuildConfig.FLAVOR);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GifGrid$lambda$13(ox6 ox6Var, List list, oh4 oh4Var, oh4 oh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        GifGrid(ox6Var, list, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void GifGridIcon(final int i, final mh4<g2b> mh4Var, jt1 jt1Var, final int i2, final int i3) {
        int i4;
        bj4 bj4VarO = jt1Var.o(-1949834895);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (bj4VarO.h(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i5 != 0) {
                mh4Var = null;
            }
            ox6 ox6VarA = raa.a(ir9.j(ox6.a.t, 16.0f), String.valueOf(i));
            int i6 = 1;
            boolean z = mh4Var != null;
            bj4VarO.K(-2076062403);
            boolean z2 = (i4 & 112) == 32;
            Object objF = bj4VarO.f();
            if (z2 || objF == jt1.a.a) {
                objF = new f10(i6, mh4Var);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            m65.b(is7.a(i, bj4VarO, i4 & 14), null, we1.c(ox6VarA, z, null, (mh4) objF, 14), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m752getActionContrastWhite0d7_KjU(), bj4VarO, 56, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: jm4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return GifGridKt.GifGridIcon$lambda$16(i, mh4Var, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GifGridIcon$lambda$15$lambda$14(mh4 mh4Var) {
        if (mh4Var != null) {
            mh4Var.invoke();
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GifGridIcon$lambda$16(int i, mh4 mh4Var, int i2, int i3, jt1 jt1Var, int i4) {
        GifGridIcon(i, mh4Var, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void PreviewGifGrid(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1512591839);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GifGridKt.INSTANCE.m162getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: em4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return GifGridKt.PreviewGifGrid$lambda$17(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewGifGrid$lambda$17(int i, jt1 jt1Var, int i2) {
        PreviewGifGrid(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
