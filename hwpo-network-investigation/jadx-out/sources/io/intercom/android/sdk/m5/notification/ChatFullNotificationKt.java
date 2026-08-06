package io.intercom.android.sdk.m5.notification;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.intercom.twig.BuildConfig;
import defpackage.a30;
import defpackage.aj1;
import defpackage.al8;
import defpackage.ay8;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cl6;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fb1;
import defpackage.fl6;
import defpackage.fr1;
import defpackage.fx0;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gi0;
import defpackage.gl6;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.hl6;
import defpackage.ib1;
import defpackage.if3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.jz7;
import defpackage.kk;
import defpackage.kr5;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nb1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.of3;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.pw3;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.uma;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.xx1;
import defpackage.yi1;
import defpackage.z2a;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.notification.ChatFullNotificationKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ChatFullNotificationKt {
    private static final AppConfig previewAppConfig;

    static {
        NexusConfig nexusConfig = new NexusConfig();
        AttachmentSettings attachmentSettings = AttachmentSettings.Companion.getDEFAULT();
        ConversationStateSyncSettings conversationStateSyncSettings = ConversationStateSyncSettings.Companion.getDEFAULT();
        of3 of3Var = of3.t;
        previewAppConfig = new AppConfig(BuildConfig.FLAVOR, -12627531, -13615201, -15064194, false, false, false, 100, 1000L, 1000L, 1000L, 1000L, true, true, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, true, BuildConfig.FLAVOR, of3Var, of3Var, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, true, false, false, false, null, nexusConfig, attachmentSettings, true, conversationStateSyncSettings, false, true);
    }

    private static final void ChatFullContent(final Conversation conversation, final Context context, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(649010099);
        if ((((i & 6) == 0 ? (bj4VarO.j(conversation) ? 4 : 2) | i : i) & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            Part partLastPart = conversation.lastPart();
            List<Block> blocks = partLastPart.getBlocks();
            float f = 1.0f;
            ox6.a aVar = ox6.a.t;
            boolean z = false;
            if (blocks == null || blocks.isEmpty()) {
                String summary = partLastPart.getSummary();
                summary.getClass();
                if (z2a.w(summary)) {
                    bj4VarO.K(343892502);
                    if (conversation.getTicket() != null) {
                        Ticket ticket = conversation.getTicket();
                        InAppNotificationCardKt.TicketInAppNotificationContent(xj5.a(ticket.getCurrentStatus().getType(), MetricTracker.Action.SUBMITTED) ? null : ticket.getAssignee().build().getForename(), ticket.getCurrentStatus().getTitle(), "Just now", bj4VarO, 384, 0);
                    }
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(343653213);
                    String summary2 = partLastPart.getSummary();
                    summary2.getClass();
                    mia.b(summary2, ir9.c(aVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType05(), bj4VarO, 48, 0, 131068);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(false);
                }
            } else {
                bj4VarO.K(343127856);
                ox6 ox6VarC = ir9.c(aVar, 1.0f);
                boolean z2 = true;
                aj1 aj1VarA = yi1.a(new c30.h(12.0f, true, new a30()), di.a.m, bj4VarO, 6);
                int iHashCode = Long.hashCode(bj4VarO.T);
                kw7 kw7VarP = bj4VarO.P();
                ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
                bt1.c.getClass();
                qr5.a aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
                bj4VarO.K(1065490145);
                for (Iterator it = blocks.iterator(); it.hasNext(); it = it) {
                    Block block = (Block) it.next();
                    ox6 ox6VarC3 = ir9.c(aVar, f);
                    block.getClass();
                    bj4 bj4Var = bj4VarO;
                    BlockViewKt.m426BlockViewOkTjGUA(ox6VarC3, new BlockRenderData(block, new uh1(gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable)), null, null, null, 28, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var, 6, 0, 8188);
                    aVar = aVar;
                    z = z;
                    bj4VarO = bj4Var;
                    f = 1.0f;
                    z2 = true;
                }
                boolean z3 = z;
                bj4VarO.U(z3);
                bj4VarO.U(true);
                bj4VarO.U(z3);
            }
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gb1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ChatFullNotificationKt.ChatFullContent$lambda$14(conversation, context, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ChatFullContent$lambda$14(Conversation conversation, Context context, int i, jt1 jt1Var, int i2) {
        ChatFullContent(conversation, context, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0117  */
    /* JADX WARN: Code duplicated, block: B:48:0x0149  */
    /* JADX WARN: Code duplicated, block: B:50:0x0150  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:54:0x0196  */
    /* JADX WARN: Code duplicated, block: B:56:0x019d  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x0249  */
    /* JADX WARN: Code duplicated, block: B:72:0x028e  */
    /* JADX WARN: Code duplicated, block: B:74:0x029d  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void ChatFullNotification(Conversation conversation, final AppConfig appConfig, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        Context context;
        Part partLastPart;
        Object objF;
        jt1.a.C0187a c0187a;
        final h37 h37Var;
        ox6 ox6Var4;
        IntercomTheme intercomTheme;
        int i4;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        int i5;
        Object objF2;
        aj1 aj1VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        qr5.a aVar3;
        ny8 ny8VarA;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        Conversation conversation2;
        final ox6 ox6Var5;
        ob4 ob4Var;
        xj8 xj8VarW;
        conversation.getClass();
        appConfig.getClass();
        bj4 bj4VarO = jt1Var.o(1263781866);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(conversation) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            if ((i3 & 131) == 130 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                partLastPart = conversation.lastPart();
                bj4VarO.K(-1543305275);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                ox6Var4 = ox6Var3;
                ox6 ox6VarA = uma.a(pw3.c(ox6Var3, 4.0f, ay8.b(8.0f), 0L, 0L, 24), ay8.b(8.0f));
                intercomTheme = IntercomTheme.INSTANCE;
                i4 = IntercomTheme.$stable;
                ox6 ox6VarC4 = gi0.c(ox6VarA, kk.a(intercomTheme, bj4VarO, i4), al8.a);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarC4);
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
                i5 = i3;
                ox6 ox6VarC5 = ir9.c(aVar, 1.0f);
                bj4VarO.K(-1134794408);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new oh4() { // from class: kb1
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ChatFullNotificationKt.ChatFullNotification$lambda$8$lambda$5$lambda$4(h37Var, ((Boolean) obj).booleanValue());
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarI = eo7.i(detectOverflow(ox6VarC5, (oh4) objF2), 16.0f);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarI);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    aVar3 = aVar2;
                    bj4VarO.k(aVar3);
                } else {
                    aVar3 = aVar2;
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ox6 ox6VarC6 = ir9.c(aVar, 1.0f);
                ny8VarA = ly8.a(new c30.h(12.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarC6);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 32.0f), PartExtensionsKt.resolvedAvatarWrapper(partLastPart), null, false, 0L, null, bj4VarO, 6, 60);
                if (conversation.getTicket() != null) {
                    bj4VarO.K(2115101176);
                    String title = conversation.getTicket().getTitle();
                    if (conversation.isRead()) {
                        ob4Var = ob4.y;
                    } else {
                        ob4Var = ob4.A;
                    }
                    TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(title, ob4Var), bj4VarO, 0, 1);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(2115436317);
                    TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(PartExtensionsKt.resolvedDisplayTitle(partLastPart), PartExtensionsKt.resolvedDisplaySuffix(partLastPart), null, null, intercomTheme.getTypography(bj4VarO, i4).getType04SemiBold(), 0L, 2, 1, null, bj4VarO, 14155776, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(false);
                }
                bj4VarO.U(true);
                b47.b(bj4VarO, ir9.d(aVar, 12.0f));
                conversation2 = conversation;
                ChatFullContent(conversation2, context, bj4VarO, i5 & 14);
                bj4VarO.U(true);
                bj4VarO.K(-1134745239);
                if (ChatFullNotification$lambda$2(h37Var)) {
                    dv0.a(gi0.b(ir9.d(ir9.c(kv0.a.f(aVar, di.a.h), 1.0f), 100.0f), fx0.a.a(ws0.i(new uh1(uh1.j), new uh1(kk.a(intercomTheme, bj4VarO, i4))))), bj4VarO, 0);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ox6Var5 = ox6Var4;
            } else {
                bj4VarO.u();
                conversation2 = conversation;
                ox6Var5 = ox6Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                final Conversation conversation3 = conversation2;
                xj8VarW.d = new ci4() { // from class: lb1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ChatFullNotificationKt.ChatFullNotification$lambda$9(conversation3, appConfig, ox6Var5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        if ((i3 & 131) == 130) {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            partLastPart = conversation.lastPart();
            bj4VarO.K(-1543305275);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            bj4VarO.U(false);
            ox6Var4 = ox6Var3;
            ox6 ox6VarA2 = uma.a(pw3.c(ox6Var3, 4.0f, ay8.b(8.0f), 0L, 0L, 24), ay8.b(8.0f));
            intercomTheme = IntercomTheme.INSTANCE;
            i4 = IntercomTheme.$stable;
            ox6 ox6VarC7 = gi0.c(ox6VarA2, kk.a(intercomTheme, bj4VarO, i4), al8.a);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarC7);
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
            i5 = i3;
            ox6 ox6VarC8 = ir9.c(aVar, 1.0f);
            bj4VarO.K(-1134794408);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = new oh4() { // from class: kb1
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ChatFullNotificationKt.ChatFullNotification$lambda$8$lambda$5$lambda$4(h37Var, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ox6 ox6VarI2 = eo7.i(detectOverflow(ox6VarC8, (oh4) objF2), 16.0f);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarI2);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                aVar3 = aVar2;
                bj4VarO.k(aVar3);
            } else {
                aVar3 = aVar2;
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ox6 ox6VarC9 = ir9.c(aVar, 1.0f);
            ny8VarA = ly8.a(new c30.h(12.0f, true, new a30()), di.a.k, bj4VarO, 54);
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, ox6VarC9);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 32.0f), PartExtensionsKt.resolvedAvatarWrapper(partLastPart), null, false, 0L, null, bj4VarO, 6, 60);
            if (conversation.getTicket() != null) {
                bj4VarO.K(2115101176);
                String title2 = conversation.getTicket().getTitle();
                if (conversation.isRead()) {
                    ob4Var = ob4.y;
                } else {
                    ob4Var = ob4.A;
                }
                TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(title2, ob4Var), bj4VarO, 0, 1);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(2115436317);
                TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(PartExtensionsKt.resolvedDisplayTitle(partLastPart), PartExtensionsKt.resolvedDisplaySuffix(partLastPart), null, null, intercomTheme.getTypography(bj4VarO, i4).getType04SemiBold(), 0L, 2, 1, null, bj4VarO, 14155776, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
                bj4VarO = bj4VarO;
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
            b47.b(bj4VarO, ir9.d(aVar, 12.0f));
            conversation2 = conversation;
            ChatFullContent(conversation2, context, bj4VarO, i5 & 14);
            bj4VarO.U(true);
            bj4VarO.K(-1134745239);
            if (ChatFullNotification$lambda$2(h37Var)) {
                dv0.a(gi0.b(ir9.d(ir9.c(kv0.a.f(aVar, di.a.h), 1.0f), 100.0f), fx0.a.a(ws0.i(new uh1(uh1.j), new uh1(kk.a(intercomTheme, bj4VarO, i4))))), bj4VarO, 0);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6Var5 = ox6Var4;
        } else {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            partLastPart = conversation.lastPart();
            bj4VarO.K(-1543305275);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            bj4VarO.U(false);
            ox6Var4 = ox6Var3;
            ox6 ox6VarA3 = uma.a(pw3.c(ox6Var3, 4.0f, ay8.b(8.0f), 0L, 0L, 24), ay8.b(8.0f));
            intercomTheme = IntercomTheme.INSTANCE;
            i4 = IntercomTheme.$stable;
            ox6 ox6VarC10 = gi0.c(ox6VarA3, kk.a(intercomTheme, bj4VarO, i4), al8.a);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarC10);
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
            i5 = i3;
            ox6 ox6VarC11 = ir9.c(aVar, 1.0f);
            bj4VarO.K(-1134794408);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = new oh4() { // from class: kb1
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ChatFullNotificationKt.ChatFullNotification$lambda$8$lambda$5$lambda$4(h37Var, ((Boolean) obj).booleanValue());
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ox6 ox6VarI3 = eo7.i(detectOverflow(ox6VarC11, (oh4) objF2), 16.0f);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarI3);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                aVar3 = aVar2;
                bj4VarO.k(aVar3);
            } else {
                aVar3 = aVar2;
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ox6 ox6VarC12 = ir9.c(aVar, 1.0f);
            ny8VarA = ly8.a(new c30.h(12.0f, true, new a30()), di.a.k, bj4VarO, 54);
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, ox6VarC12);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 32.0f), PartExtensionsKt.resolvedAvatarWrapper(partLastPart), null, false, 0L, null, bj4VarO, 6, 60);
            if (conversation.getTicket() != null) {
                bj4VarO.K(2115101176);
                String title3 = conversation.getTicket().getTitle();
                if (conversation.isRead()) {
                    ob4Var = ob4.y;
                } else {
                    ob4Var = ob4.A;
                }
                TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(title3, ob4Var), bj4VarO, 0, 1);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(2115436317);
                TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(PartExtensionsKt.resolvedDisplayTitle(partLastPart), PartExtensionsKt.resolvedDisplaySuffix(partLastPart), null, null, intercomTheme.getTypography(bj4VarO, i4).getType04SemiBold(), 0L, 2, 1, null, bj4VarO, 14155776, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
                bj4VarO = bj4VarO;
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
            b47.b(bj4VarO, ir9.d(aVar, 12.0f));
            conversation2 = conversation;
            ChatFullContent(conversation2, context, bj4VarO, i5 & 14);
            bj4VarO.U(true);
            bj4VarO.K(-1134745239);
            if (ChatFullNotification$lambda$2(h37Var)) {
                dv0.a(gi0.b(ir9.d(ir9.c(kv0.a.f(aVar, di.a.h), 1.0f), 100.0f), fx0.a.a(ws0.i(new uh1(uh1.j), new uh1(kk.a(intercomTheme, bj4VarO, i4))))), bj4VarO, 0);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6Var5 = ox6Var4;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final Conversation conversation4 = conversation2;
            xj8VarW.d = new ci4() { // from class: lb1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ChatFullNotificationKt.ChatFullNotification$lambda$9(conversation4, appConfig, ox6Var5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    private static final boolean ChatFullNotification$lambda$2(h37<Boolean> h37Var) {
        return h37Var.getValue().booleanValue();
    }

    private static final void ChatFullNotification$lambda$3(h37<Boolean> h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ChatFullNotification$lambda$8$lambda$5$lambda$4(h37 h37Var, boolean z) {
        ChatFullNotification$lambda$3(h37Var, z);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ChatFullNotification$lambda$9(Conversation conversation, AppConfig appConfig, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        ChatFullNotification(conversation, appConfig, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void ChatFullNotificationAssignedTicketPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-671495709);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m379getLambda5$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ib1(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ChatFullNotificationAssignedTicketPreview$lambda$19(int i, jt1 jt1Var, int i2) {
        ChatFullNotificationAssignedTicketPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void ChatFullNotificationBotPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1053171888);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m377getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new nb1(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ChatFullNotificationBotPreview$lambda$17(int i, jt1 jt1Var, int i2) {
        ChatFullNotificationBotPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void ChatFullNotificationPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1120680649);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m375getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: eb1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ChatFullNotificationKt.ChatFullNotificationPreview$lambda$15(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ChatFullNotificationPreview$lambda$15(int i, jt1 jt1Var, int i2) {
        ChatFullNotificationPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void ChatFullNotificationShortMessagePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(735919252);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m376getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new fb1(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ChatFullNotificationShortMessagePreview$lambda$16(int i, jt1 jt1Var, int i2) {
        ChatFullNotificationShortMessagePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void ChatFullNotificationTicketPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(202840309);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m378getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: hb1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ChatFullNotificationKt.ChatFullNotificationTicketPreview$lambda$18(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ChatFullNotificationTicketPreview$lambda$18(int i, jt1 jt1Var, int i2) {
        ChatFullNotificationTicketPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void addChatFullNotificationToView(ComposeView composeView, final Conversation conversation, final AppConfig appConfig) {
        conversation.getClass();
        appConfig.getClass();
        if (composeView == null || ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(new fr1(true, 1805122629, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$addChatFullNotificationToView$1$1
            public final void invoke(jt1 jt1Var, int i) {
                if ((i & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                    return;
                }
                final Conversation conversation2 = conversation;
                final AppConfig appConfig2 = appConfig;
                IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(583177563, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$addChatFullNotificationToView$1$1.1
                    public final void invoke(jt1 jt1Var2, int i2) {
                        if ((i2 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            ChatFullNotificationKt.ChatFullNotification(conversation2, appConfig2, null, jt1Var2, 0, 4);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, jt1Var), jt1Var, 3072, 7);
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }
        }));
    }

    private static final ox6 detectOverflow(ox6 ox6Var, final oh4<? super Boolean, g2b> oh4Var) {
        return kr5.a(ox6Var, new ei4() { // from class: jb1
            @Override // defpackage.ei4
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ChatFullNotificationKt.detectOverflow$lambda$11(oh4Var, (hl6) obj, (cl6) obj2, (xx1) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gl6 detectOverflow$lambda$11(oh4 oh4Var, hl6 hl6Var, cl6 cl6Var, xx1 xx1Var) {
        hl6Var.getClass();
        cl6Var.getClass();
        final jz7 jz7VarE = cl6Var.E(xx1.a(0, 0, 0, Integer.MAX_VALUE, 7, xx1Var.a));
        int i = jz7VarE.u;
        long j = xx1Var.a;
        oh4Var.invoke(Boolean.valueOf(i > xx1.g(j)));
        int i2 = jz7VarE.u;
        int iG = xx1.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        return hl6Var.y0(jz7VarE.t, i2, if3.t, new oh4() { // from class: mb1
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                return ChatFullNotificationKt.detectOverflow$lambda$11$lambda$10(jz7VarE, (jz7.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b detectOverflow$lambda$11$lambda$10(jz7 jz7Var, jz7.a aVar) {
        aVar.getClass();
        aVar.l(jz7Var, 0, 0, 0.0f);
        return g2b.a;
    }
}
