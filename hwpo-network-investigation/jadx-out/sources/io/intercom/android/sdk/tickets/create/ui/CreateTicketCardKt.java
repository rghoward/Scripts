package io.intercom.android.sdk.tickets.create.ui;

import defpackage.ah5;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.hf3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.u7d;
import defpackage.va2;
import defpackage.we1;
import defpackage.wja;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.yq5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketCardKt {
    private static final Block sampleBlock = new Block.Builder().withType(BlockType.CREATETICKETCARD.getSerializedName()).withText("Admin has requested you to create a ticket").withTitle("Create ticket").withTicketTypeTitle("Bug").withTicketType(new TicketType(1234, "Bug", "🎟", hf3.t, false)).build();

    /* JADX WARN: Code duplicated, block: B:50:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void CreateTicketCard(ox6 ox6Var, final BlockRenderData blockRenderData, final boolean z, mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        mh4<g2b> mh4Var2;
        ox6 ox6Var3;
        mh4<g2b> mh4Var3;
        bj4 bj4Var;
        final mh4<g2b> mh4Var4;
        xj8 xj8VarW;
        blockRenderData.getClass();
        bj4 bj4VarO = jt1Var.o(-214450953);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= bj4VarO.j(blockRenderData) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.c(z) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                mh4Var2 = mh4Var;
                i3 |= bj4VarO.j(mh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i5 != 0) {
                    mh4Var3 = null;
                } else {
                    mh4Var3 = mh4Var2;
                }
                bj4Var = bj4VarO;
                IntercomCardKt.IntercomCard(ir9.c(ox6Var3, 1.0f), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4Var, IntercomCardStyle.$stable << 15, 31), gr1.b(1721044843, new AnonymousClass1(z, mh4Var3, blockRenderData), bj4Var), bj4Var, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
                mh4Var4 = mh4Var3;
                ox6Var2 = ox6Var3;
            } else {
                bj4VarO.u();
                mh4Var4 = mh4Var2;
                bj4Var = bj4VarO;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ta2
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CreateTicketCardKt.CreateTicketCard$lambda$0(ox6Var2, blockRenderData, z, mh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        mh4Var2 = mh4Var;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i5 != 0) {
                mh4Var3 = null;
            } else {
                mh4Var3 = mh4Var2;
            }
            bj4Var = bj4VarO;
            IntercomCardKt.IntercomCard(ir9.c(ox6Var3, 1.0f), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4Var, IntercomCardStyle.$stable << 15, 31), gr1.b(1721044843, new AnonymousClass1(z, mh4Var3, blockRenderData), bj4Var), bj4Var, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
            mh4Var4 = mh4Var3;
            ox6Var2 = ox6Var3;
        } else {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i5 != 0) {
                mh4Var3 = null;
            } else {
                mh4Var3 = mh4Var2;
            }
            bj4Var = bj4VarO;
            IntercomCardKt.IntercomCard(ir9.c(ox6Var3, 1.0f), IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4Var, IntercomCardStyle.$stable << 15, 31), gr1.b(1721044843, new AnonymousClass1(z, mh4Var3, blockRenderData), bj4Var), bj4Var, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
            mh4Var4 = mh4Var3;
            ox6Var2 = ox6Var3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ta2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CreateTicketCardKt.CreateTicketCard$lambda$0(ox6Var2, blockRenderData, z, mh4Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CreateTicketCard$lambda$0(ox6 ox6Var, BlockRenderData blockRenderData, boolean z, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        CreateTicketCard(ox6Var, blockRenderData, z, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void DisabledCreateTicketCardPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1443652823);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketCardKt.INSTANCE.m533getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ua2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CreateTicketCardKt.DisabledCreateTicketCardPreview$lambda$2(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DisabledCreateTicketCardPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        DisabledCreateTicketCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void EnabledCreateTicketCardPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1535832576);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketCardKt.INSTANCE.m532getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new va2(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EnabledCreateTicketCardPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        EnabledCreateTicketCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt$CreateTicketCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ei4<bj1, jt1, Integer, g2b> {
        final /* synthetic */ BlockRenderData $blockRenderData;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ mh4<g2b> $onClick;

        public AnonymousClass1(boolean z, mh4<g2b> mh4Var, BlockRenderData blockRenderData) {
            this.$enabled = z;
            this.$onClick = mh4Var;
            this.$blockRenderData = blockRenderData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(mh4 mh4Var) {
            if (mh4Var != null) {
                mh4Var.invoke();
            }
            return g2b.a;
        }

        public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
            bj1Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            boolean z = this.$enabled;
            jt1Var.K(2105918451);
            boolean zJ = jt1Var.J(this.$onClick);
            final mh4<g2b> mh4Var = this.$onClick;
            Object objF = jt1Var.f();
            if (zJ || objF == jt1.a.a) {
                objF = new mh4() { // from class: io.intercom.android.sdk.tickets.create.ui.t
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return CreateTicketCardKt.AnonymousClass1.invoke$lambda$1$lambda$0(mh4Var);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = we1.c(aVar, z, null, (mh4) objF, 14);
            boolean z2 = this.$enabled;
            BlockRenderData blockRenderData = this.$blockRenderData;
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC2 = it1.c(jt1Var, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar2);
            } else {
                jt1Var.z();
            }
            bt1.a.c cVar = bt1.a.f;
            rd7.d(jt1Var, cVar, fl6VarD);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(jt1Var, eVar, kw7VarY);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar = bt1.a.g;
            rd7.d(jt1Var, bVar, numValueOf);
            bt1.a.C0034a c0034a = bt1.a.h;
            rd7.c(jt1Var, c0034a);
            bt1.a.d dVar = bt1.a.d;
            rd7.d(jt1Var, dVar, ox6VarC2);
            ox6 ox6VarI = eo7.i(ir9.c(aVar, 1.0f), 16.0f);
            ny8 ny8VarA = ly8.a(c30.f, di.a.k, jt1Var, 54);
            int iHashCode2 = Long.hashCode(jt1Var.v());
            kw7 kw7VarY2 = jt1Var.y();
            ox6 ox6VarC3 = it1.c(jt1Var, ox6VarI);
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar2);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, cVar, ny8VarA);
            rd7.d(jt1Var, eVar, kw7VarY2);
            g3.c(iHashCode2, jt1Var, bVar, jt1Var, c0034a);
            rd7.d(jt1Var, dVar, ox6VarC3);
            qs5 qs5Var = new qs5(true, 1.0f);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
            int iHashCode3 = Long.hashCode(jt1Var.v());
            kw7 kw7VarY3 = jt1Var.y();
            ox6 ox6VarC4 = it1.c(jt1Var, qs5Var);
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar2);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, cVar, aj1VarA);
            rd7.d(jt1Var, eVar, kw7VarY3);
            g3.c(iHashCode3, jt1Var, bVar, jt1Var, c0034a);
            rd7.d(jt1Var, dVar, ox6VarC4);
            String title = blockRenderData.getBlock().getTitle();
            title.getClass();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i2 = IntercomTheme.$stable;
            mia.b(title, yq5.b(aVar, BubbleMessageRowKt.contentAlpha(z2, jt1Var, 0)), ah5.a(intercomTheme, jt1Var, i2), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var, i2).getType04SemiBold(), jt1Var, 0, 0, 131064);
            b47.b(jt1Var, ir9.d(aVar, 2.0f));
            String name = blockRenderData.getBlock().getTicketType().getName();
            wja type04 = intercomTheme.getTypography(jt1Var, i2).getType04();
            mia.b(name, yq5.b(aVar, BubbleMessageRowKt.contentAlpha(z2, jt1Var, 0)), u7d.d(4285887861L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var, 384, 0, 131064);
            jt1Var.I();
            b47.b(jt1Var, ir9.n(aVar, 16.0f));
            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var, 0), null, yq5.b(ir9.j(aVar, 16.0f), BubbleMessageRowKt.contentAlpha(z2, jt1Var, 0)), intercomTheme.getColors(jt1Var, i2).m752getActionContrastWhite0d7_KjU(), jt1Var, 56, 0);
            jt1Var.I();
            jt1Var.I();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var, Integer num) {
            invoke(bj1Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
