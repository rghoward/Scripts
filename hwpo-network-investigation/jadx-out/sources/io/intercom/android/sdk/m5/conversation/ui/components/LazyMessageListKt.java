package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aa0;
import defpackage.at7;
import defpackage.b27;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt7;
import defpackage.bx0;
import defpackage.bz5;
import defpackage.c30;
import defpackage.ci4;
import defpackage.d42;
import defpackage.d7;
import defpackage.di;
import defpackage.e7;
import defpackage.eo7;
import defpackage.fi4;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g27;
import defpackage.g2b;
import defpackage.g7;
import defpackage.gz3;
import defpackage.h37;
import defpackage.h7;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.ko7;
import defpackage.mh4;
import defpackage.nr1;
import defpackage.nz5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qu1;
import defpackage.qz5;
import defpackage.sz5;
import defpackage.th1;
import defpackage.tx2;
import defpackage.u;
import defpackage.uz5;
import defpackage.wd3;
import defpackage.wz5;
import defpackage.xj8;
import defpackage.xv;
import defpackage.xw0;
import defpackage.xz5;
import defpackage.ys5;
import defpackage.yz9;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.FooterNoticeKt;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.DayDividerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NewMessagesRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TeamIntroKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TicketStatusRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.IntercomArrangement;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LazyMessageListKt {
    private static final float BigMessageGap = 24.0f;
    private static final float DefaultMessageGap = 16.0f;
    private static final float GroupedMessageGap = 2.0f;
    private static final float LargeMessageGap = 32.0f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupingPosition.values().length];
            try {
                iArr[GroupingPosition.STANDALONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupingPosition.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupingPosition.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupingPosition.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:109:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x014d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:114:0x015a  */
    /* JADX WARN: Code duplicated, block: B:116:0x015f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x0170  */
    /* JADX WARN: Code duplicated, block: B:123:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:131:0x0191  */
    /* JADX WARN: Code duplicated, block: B:132:0x0194  */
    /* JADX WARN: Code duplicated, block: B:134:0x019a  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01be  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:154:0x01de  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:163:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:165:0x0201  */
    /* JADX WARN: Code duplicated, block: B:167:0x0207  */
    /* JADX WARN: Code duplicated, block: B:169:0x020d  */
    /* JADX WARN: Code duplicated, block: B:173:0x021c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0249  */
    /* JADX WARN: Code duplicated, block: B:181:0x0257  */
    /* JADX WARN: Code duplicated, block: B:188:0x027e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0280  */
    /* JADX WARN: Code duplicated, block: B:192:0x0289  */
    /* JADX WARN: Code duplicated, block: B:194:0x0291  */
    /* JADX WARN: Code duplicated, block: B:196:0x029d  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:201:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:204:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:211:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:216:0x030b  */
    /* JADX WARN: Code duplicated, block: B:218:0x031a  */
    /* JADX WARN: Code duplicated, block: B:220:0x031d  */
    /* JADX WARN: Code duplicated, block: B:222:0x0329  */
    /* JADX WARN: Code duplicated, block: B:224:0x0337  */
    /* JADX WARN: Code duplicated, block: B:226:0x033b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0347  */
    /* JADX WARN: Code duplicated, block: B:230:0x0356  */
    /* JADX WARN: Code duplicated, block: B:232:0x035a  */
    /* JADX WARN: Code duplicated, block: B:233:0x035c  */
    /* JADX WARN: Code duplicated, block: B:235:0x0360  */
    /* JADX WARN: Code duplicated, block: B:237:0x036c  */
    /* JADX WARN: Code duplicated, block: B:238:0x0378  */
    /* JADX WARN: Code duplicated, block: B:240:0x0381  */
    /* JADX WARN: Code duplicated, block: B:242:0x0387  */
    /* JADX WARN: Code duplicated, block: B:243:0x0389  */
    /* JADX WARN: Code duplicated, block: B:245:0x038d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0390  */
    /* JADX WARN: Code duplicated, block: B:248:0x0394  */
    /* JADX WARN: Code duplicated, block: B:249:0x0397  */
    /* JADX WARN: Code duplicated, block: B:252:0x039d  */
    /* JADX WARN: Code duplicated, block: B:254:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:257:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:260:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:263:0x0412  */
    /* JADX WARN: Code duplicated, block: B:264:0x0428  */
    /* JADX WARN: Code duplicated, block: B:267:0x0437  */
    /* JADX WARN: Code duplicated, block: B:270:0x044c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0496  */
    /* JADX WARN: Code duplicated, block: B:277:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:279:0x04a6 A[PHI: r46
      0x04a6: PHI (r46v9 nz5) = (r46v1 nz5), (r46v10 nz5) binds: [B:278:0x04a4, B:276:0x049d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:283:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:289:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:293:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:295:0x0504 A[PHI: r46
      0x0504: PHI (r46v7 nz5) = (r46v3 nz5), (r46v8 nz5) binds: [B:294:0x0502, B:292:0x04fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:296:0x0507  */
    /* JADX WARN: Code duplicated, block: B:299:0x050f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:302:0x0517  */
    /* JADX WARN: Code duplicated, block: B:305:0x0545  */
    /* JADX WARN: Code duplicated, block: B:307:0x054b  */
    /* JADX WARN: Code duplicated, block: B:313:0x0559 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:314:0x055b  */
    /* JADX WARN: Code duplicated, block: B:317:0x0577  */
    /* JADX WARN: Code duplicated, block: B:319:0x057d  */
    /* JADX WARN: Code duplicated, block: B:325:0x058b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:326:0x058d  */
    /* JADX WARN: Code duplicated, block: B:329:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:331:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:337:0x05c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:338:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:341:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:342:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:345:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:352:0x0607  */
    /* JADX WARN: Code duplicated, block: B:355:0x0625  */
    /* JADX WARN: Code duplicated, block: B:356:0x0628  */
    /* JADX WARN: Code duplicated, block: B:359:0x0630  */
    /* JADX WARN: Code duplicated, block: B:360:0x0633  */
    /* JADX WARN: Code duplicated, block: B:363:0x0640  */
    /* JADX WARN: Code duplicated, block: B:364:0x0643  */
    /* JADX WARN: Code duplicated, block: B:367:0x064b  */
    /* JADX WARN: Code duplicated, block: B:368:0x064e  */
    /* JADX WARN: Code duplicated, block: B:371:0x0656  */
    /* JADX WARN: Code duplicated, block: B:372:0x0659  */
    /* JADX WARN: Code duplicated, block: B:375:0x0665  */
    /* JADX WARN: Code duplicated, block: B:376:0x0668  */
    /* JADX WARN: Code duplicated, block: B:379:0x066e  */
    /* JADX WARN: Code duplicated, block: B:381:0x0674  */
    /* JADX WARN: Code duplicated, block: B:387:0x0683  */
    /* JADX WARN: Code duplicated, block: B:388:0x0686  */
    /* JADX WARN: Code duplicated, block: B:391:0x068e  */
    /* JADX WARN: Code duplicated, block: B:392:0x0691  */
    /* JADX WARN: Code duplicated, block: B:395:0x069a  */
    /* JADX WARN: Code duplicated, block: B:396:0x069d  */
    /* JADX WARN: Code duplicated, block: B:399:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:400:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:404:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:407:0x06c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:410:0x06de  */
    /* JADX WARN: Code duplicated, block: B:414:0x074c  */
    /* JADX WARN: Code duplicated, block: B:416:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x0124  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    /* JADX WARN: Instruction removed from duplicated block: B:179:0x0249, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v89 */
    public static final void LazyMessageList(ox6 ox6Var, final List<? extends ContentRow> list, nz5 nz5Var, oh4<? super ReplySuggestion, g2b> oh4Var, oh4<? super ReplyOption, g2b> oh4Var2, oh4<? super Part, g2b> oh4Var3, oh4<? super PendingMessage.FailedMediaUploadData, g2b> oh4Var4, oh4<? super AttributeData, g2b> oh4Var5, mh4<g2b> mh4Var, oh4<? super TicketType, g2b> oh4Var6, boolean z, oh4<? super String, g2b> oh4Var7, boolean z2, ci4<? super List<InlineSource>, ? super List<Source>, g2b> ci4Var, boolean z3, mh4<g2b> mh4Var2, jt1 jt1Var, final int i, final int i2, final int i3) {
        ox6 ox6Var2;
        int i4;
        nz5 nz5VarA;
        oh4<? super ReplySuggestion, g2b> oh4Var8;
        int i5;
        oh4<? super ReplyOption, g2b> oh4Var9;
        int i6;
        int i7;
        oh4<? super Part, g2b> oh4Var10;
        int i8;
        int i9;
        final oh4<? super PendingMessage.FailedMediaUploadData, g2b> oh4Var11;
        int i10;
        int i11;
        oh4<? super AttributeData, g2b> oh4Var12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        int i36;
        oh4<? super AttributeData, g2b> oh4Var13;
        mh4<g2b> mh4Var3;
        oh4<? super TicketType, g2b> oh4Var14;
        boolean z4;
        oh4<? super String, g2b> oh4Var15;
        boolean z5;
        ci4<? super List<InlineSource>, ? super List<Source>, g2b> ci4Var2;
        boolean z6;
        boolean z7;
        mh4<g2b> mh4Var4;
        boolean z8;
        ox6 ox6Var3;
        int i37;
        nz5 nz5Var2;
        oh4<? super Part, g2b> oh4Var16;
        oh4<? super TicketType, g2b> oh4Var17;
        oh4<? super String, g2b> oh4Var18;
        mh4<g2b> mh4Var5;
        Object objF;
        Object objF2;
        Object objF3;
        Object objF4;
        Object objF5;
        Object objF6;
        Object objF7;
        Object objF8;
        Object objF9;
        final Context context;
        oh4<? super AttributeData, g2b> oh4Var19;
        oh4<? super PendingMessage.FailedMediaUploadData, g2b> oh4Var20;
        yz9<KeyboardState> yz9VarKeyboardAsState;
        Object objF10;
        mh4<g2b> mh4Var6;
        b27 b27Var;
        ?? r6;
        float fU0;
        Object objB;
        final g27 g27Var;
        oh4<? super ReplySuggestion, g2b> oh4Var21;
        Object objB2;
        h37 h37Var;
        oh4<? super ReplyOption, g2b> oh4Var22;
        float f;
        int i38;
        int i39;
        nz5 nz5Var3;
        boolean z9;
        boolean z10;
        Object objF11;
        oh4<? super TicketType, g2b> oh4Var23;
        nz5 nz5Var4;
        boolean z11;
        boolean z12;
        Object objF12;
        final nz5 nz5Var5;
        h37 h37Var2;
        boolean z13;
        Object objF13;
        boolean z14;
        Object objF14;
        boolean zJ;
        Object objF15;
        float composerHalfSize;
        ContentRow contentRow;
        c30.l lVarItemAtBottom;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean zJ2;
        Object obj2;
        final oh4<? super PendingMessage.FailedMediaUploadData, g2b> oh4Var24;
        final oh4<? super ReplySuggestion, g2b> oh4Var25;
        final oh4<? super TicketType, g2b> oh4Var26;
        final oh4<? super String, g2b> oh4Var27;
        final boolean z25;
        final mh4<g2b> mh4Var7;
        final oh4<? super ReplyOption, g2b> oh4Var28;
        final ci4<? super List<InlineSource>, ? super List<Source>, g2b> ci4Var3;
        final oh4<? super AttributeData, g2b> oh4Var29;
        final mh4<g2b> mh4Var8;
        final oh4<? super Part, g2b> oh4Var30;
        bj4 bj4Var;
        final ci4<? super List<InlineSource>, ? super List<Source>, g2b> ci4Var4;
        final boolean z26;
        final mh4<g2b> mh4Var9;
        final oh4<? super Part, g2b> oh4Var31;
        final oh4<? super TicketType, g2b> oh4Var32;
        final boolean z27;
        final oh4<? super ReplyOption, g2b> oh4Var33;
        final oh4<? super String, g2b> oh4Var34;
        final mh4<g2b> mh4Var10;
        final oh4<? super ReplySuggestion, g2b> oh4Var35;
        final nz5 nz5Var6;
        final oh4<? super AttributeData, g2b> oh4Var36;
        final boolean z28;
        bj4 bj4Var2;
        xj8 xj8VarW;
        list.getClass();
        bj4 bj4VarO = jt1Var.o(-906198490);
        int i40 = i3 & 1;
        if (i40 != 0) {
            i4 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i4 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= bj4VarO.j(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                nz5VarA = nz5Var;
                int i41 = bj4VarO.J(nz5VarA) ? 256 : 128;
                i4 |= i41;
            } else {
                nz5VarA = nz5Var;
            }
            i4 |= i41;
        } else {
            nz5VarA = nz5Var;
        }
        int i42 = i3 & 8;
        if (i42 == 0) {
            if ((i & 3072) == 0) {
                oh4Var8 = oh4Var;
                i4 |= bj4VarO.j(oh4Var8) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var9 = oh4Var2;
                    if (bj4VarO.j(oh4Var9)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    oh4Var10 = oh4Var3;
                } else {
                    oh4Var10 = oh4Var3;
                    if ((i & 196608) == 0) {
                        if (bj4VarO.j(oh4Var10)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    oh4Var11 = oh4Var4;
                } else {
                    oh4Var11 = oh4Var4;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.j(oh4Var11)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                    oh4Var12 = oh4Var5;
                } else {
                    oh4Var12 = oh4Var5;
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(oh4Var12)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & 256;
                if (i13 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                i15 = i3 & 512;
                if (i15 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (bj4VarO.j(oh4Var6)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i4 |= i16;
                }
                i17 = i3 & 1024;
                if (i17 != 0) {
                    i18 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (bj4VarO.c(z)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i2 | i19;
                } else {
                    i18 = i2;
                }
                i20 = i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i20 != 0) {
                    i18 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (bj4VarO.j(oh4Var7)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i18 |= i21;
                }
                i22 = i18;
                i23 = i3 & 4096;
                if (i23 != 0) {
                    i25 = i22 | 384;
                } else {
                    i24 = i22;
                    if ((i2 & 384) != 0) {
                        if (bj4VarO.c(z2)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i24 |= i26;
                    }
                    i25 = i24;
                }
                i27 = i3 & 8192;
                if (i27 != 0) {
                    i29 = i25 | 3072;
                } else {
                    i28 = i25;
                    if ((i2 & 3072) == 0) {
                        i29 = i28 | (bj4VarO.j(ci4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
                    } else {
                        i29 = i28;
                    }
                }
                i30 = i3 & 16384;
                if (i30 != 0) {
                    i32 = i29 | 24576;
                } else {
                    i31 = i29;
                    if ((i2 & 24576) == 0) {
                        i32 = i31 | (bj4VarO.c(z3) ? 16384 : 8192);
                    } else {
                        i32 = i31;
                    }
                }
                i33 = i3 & 32768;
                if (i33 != 0) {
                    i32 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i32 |= bj4VarO.j(mh4Var2) ? 131072 : 65536;
                }
                i34 = i32;
                if ((i4 & 306783379) != 306783378 && (74899 & i34) == 74898 && bj4VarO.r()) {
                    bj4VarO.u();
                    mh4Var10 = mh4Var;
                    ci4Var4 = ci4Var;
                    z26 = z3;
                    mh4Var9 = mh4Var2;
                    bj4Var2 = bj4VarO;
                    ox6Var3 = ox6Var2;
                    nz5Var6 = nz5VarA;
                    oh4Var35 = oh4Var8;
                    oh4Var33 = oh4Var9;
                    oh4Var32 = oh4Var6;
                    z28 = z;
                    oh4Var34 = oh4Var7;
                    oh4Var36 = oh4Var12;
                    oh4Var31 = oh4Var10;
                    z27 = z2;
                } else {
                    bj4VarO.v0();
                    i35 = i & 1;
                    obj = jt1.a.a;
                    if (i35 != 0 || bj4VarO.c0()) {
                        if (i40 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        i36 = 3;
                        if ((i3 & 4) != 0) {
                            nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                            i4 &= -897;
                        }
                        if (i42 != 0) {
                            bj4VarO.K(-1167352612);
                            objF9 = bj4VarO.f();
                            if (objF9 == obj) {
                                objF9 = new sz5();
                                bj4VarO.C(objF9);
                            }
                            oh4Var8 = (oh4) objF9;
                            bj4VarO.U(false);
                        }
                        if (i5 != 0) {
                            bj4VarO.K(-1167351076);
                            objF8 = bj4VarO.f();
                            if (objF8 == obj) {
                                objF8 = new d42(2);
                                bj4VarO.C(objF8);
                            }
                            oh4Var9 = (oh4) objF8;
                            bj4VarO.U(false);
                        }
                        if (i7 != 0) {
                            bj4VarO.K(-1167349540);
                            objF7 = bj4VarO.f();
                            if (objF7 == obj) {
                                objF7 = new bx0(i36);
                                bj4VarO.C(objF7);
                            }
                            oh4Var10 = (oh4) objF7;
                            bj4VarO.U(false);
                        }
                        if (i9 != 0) {
                            bj4VarO.K(-1167347044);
                            objF6 = bj4VarO.f();
                            if (objF6 == obj) {
                                objF6 = new d7(2);
                                bj4VarO.C(objF6);
                            }
                            oh4Var11 = (oh4) objF6;
                            bj4VarO.U(false);
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1167345348);
                            objF5 = bj4VarO.f();
                            if (objF5 == obj) {
                                objF5 = new e7(i36);
                                bj4VarO.C(objF5);
                            }
                            oh4Var13 = (oh4) objF5;
                            bj4VarO.U(false);
                        } else {
                            oh4Var13 = oh4Var12;
                        }
                        if (i13 != 0) {
                            bj4VarO.K(-1167343908);
                            objF4 = bj4VarO.f();
                            if (objF4 == obj) {
                                objF4 = new wz5();
                                bj4VarO.C(objF4);
                            }
                            mh4Var3 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var3 = mh4Var;
                        }
                        if (i15 != 0) {
                            bj4VarO.K(-1167342404);
                            objF3 = bj4VarO.f();
                            if (objF3 == obj) {
                                objF3 = new g7(2);
                                bj4VarO.C(objF3);
                            }
                            oh4Var14 = (oh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            oh4Var14 = oh4Var6;
                        }
                        if (i17 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if (i20 != 0) {
                            bj4VarO.K(-1167339236);
                            objF2 = bj4VarO.f();
                            if (objF2 == obj) {
                                objF2 = new h7(2);
                                bj4VarO.C(objF2);
                            }
                            oh4Var15 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var13 = oh4Var13;
                            oh4Var15 = oh4Var7;
                        }
                        if (i23 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i27 != 0) {
                            ci4Var2 = null;
                        } else {
                            ci4Var2 = ci4Var;
                        }
                        if (i30 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        oh4<? super String, g2b> oh4Var37 = oh4Var15;
                        if (i33 != 0) {
                            bj4VarO.K(-1167332516);
                            objF = bj4VarO.f();
                            if (objF == obj) {
                                objF = new xz5();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            z7 = z6;
                            mh4Var4 = (mh4) objF;
                        } else {
                            z7 = z6;
                            mh4Var4 = mh4Var2;
                        }
                        z8 = z5;
                        ox6Var3 = ox6Var2;
                        i37 = i4;
                        nz5Var2 = nz5VarA;
                        oh4Var16 = oh4Var10;
                        oh4Var17 = oh4Var14;
                        oh4Var18 = oh4Var37;
                        mh4Var5 = mh4Var3;
                        oh4Var12 = oh4Var13;
                    } else {
                        bj4VarO.u();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        z4 = z;
                        oh4Var18 = oh4Var7;
                        z8 = z2;
                        ci4Var2 = ci4Var;
                        z7 = z3;
                        mh4Var4 = mh4Var2;
                        ox6Var3 = ox6Var2;
                        i37 = i4;
                        nz5Var2 = nz5VarA;
                        oh4Var16 = oh4Var10;
                        mh4Var5 = mh4Var;
                        oh4Var17 = oh4Var6;
                    }
                    bj4VarO.V();
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    oh4Var19 = oh4Var12;
                    oh4Var20 = oh4Var11;
                    yz9VarKeyboardAsState = KeyboardStateKt.keyboardAsState(bj4VarO, 0);
                    bj4VarO.K(-1167326626);
                    objF10 = bj4VarO.f();
                    mh4Var6 = mh4Var5;
                    if (objF10 == obj) {
                        objF10 = new at7(0.0f);
                        bj4VarO.C(objF10);
                    }
                    b27Var = (b27) objF10;
                    bj4VarO.U(false);
                    bj4VarO.K(-1167324387);
                    if (z8) {
                        r6 = 0;
                        fU0 = ((tx2) bj4VarO.F(qu1.h)).U0(PoweredByBadgeKt.getPoweredByBadgeHeight(bj4VarO, 0));
                    } else {
                        r6 = 0;
                        fU0 = 0.0f;
                    }
                    objB = aa0.b(bj4VarO, r6, -1167319173);
                    if (objB == obj) {
                        objB = new bt7(r6);
                        bj4VarO.C(objB);
                    }
                    g27Var = (g27) objB;
                    oh4Var21 = oh4Var8;
                    objB2 = aa0.b(bj4VarO, r6, -1167317156);
                    if (objB2 == obj) {
                        objB2 = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objB2);
                    }
                    h37Var = (h37) objB2;
                    bj4VarO.U(r6);
                    Boolean boolValueOf = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isVisible());
                    Boolean boolValueOf2 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isAnimating());
                    oh4Var22 = oh4Var9;
                    bj4VarO.K(-1167312546);
                    boolean zJ3 = bj4VarO.J(yz9VarKeyboardAsState) | bj4VarO.g(fU0);
                    f = fU0;
                    i38 = i37;
                    i39 = (i38 & 896) ^ 384;
                    if (i39 > 256 || !bj4VarO.J(nz5Var2)) {
                        nz5Var3 = nz5Var2;
                        if ((i38 & 384) != 256) {
                            z9 = false;
                        }
                        z10 = zJ3 | z9;
                        objF11 = bj4VarO.f();
                        if (z10 || objF11 == obj) {
                            objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                            bj4VarO.C(objF11);
                        }
                        oh4Var23 = oh4Var17;
                        bj4VarO.U(false);
                        wd3.f(boolValueOf, boolValueOf2, (ci4) objF11, bj4VarO);
                        Boolean boolValueOf3 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isDismissed());
                        bj4VarO.K(-1167299697);
                        boolean zJ4 = bj4VarO.J(yz9VarKeyboardAsState);
                        if (i39 > 256 || !bj4VarO.J(nz5Var3)) {
                            nz5Var4 = nz5Var3;
                            if ((i38 & 384) != 256) {
                                z11 = false;
                            }
                            z12 = z11 | zJ4;
                            objF12 = bj4VarO.f();
                            if (!z12 || objF12 == obj) {
                                nz5 nz5Var7 = nz5Var4;
                                objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var7, yz9VarKeyboardAsState, h37Var, b27Var, null);
                                nz5Var5 = nz5Var7;
                                h37Var2 = h37Var;
                                bj4VarO.C(objF12);
                            } else {
                                nz5Var5 = nz5Var4;
                                h37Var2 = h37Var;
                            }
                            bj4VarO.U(false);
                            wd3.d(bj4VarO, (ci4) objF12, boolValueOf3);
                            bj4VarO.K(-1167291782);
                            z13 = (i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256;
                            objF13 = bj4VarO.f();
                            if (z13 || objF13 == obj) {
                                objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                                bj4VarO.C(objF13);
                            }
                            bj4VarO.U(false);
                            wd3.d(bj4VarO, (ci4) objF13, nz5Var5);
                            bj4VarO.K(-1167285484);
                            z14 = (i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256;
                            objF14 = bj4VarO.f();
                            if (z14 || objF14 == obj) {
                                objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                                bj4VarO.C(objF14);
                            }
                            bj4VarO.U(false);
                            wd3.d(bj4VarO, (ci4) objF14, nz5Var5);
                            bj4VarO.K(-1167277270);
                            zJ = bj4VarO.j(list) | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                            objF15 = bj4VarO.f();
                            if (zJ || objF15 == obj) {
                                objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                                bj4VarO.C(objF15);
                            }
                            bj4VarO.U(false);
                            int i43 = i38 >> 3;
                            wd3.d(bj4VarO, (ci4) objF15, list);
                            ox6 ox6VarH = ox6Var3.H(ir9.c);
                            if (z4) {
                                composerHalfSize = MessageComposerKt.getComposerHalfSize();
                            } else {
                                composerHalfSize = 0.0f;
                            }
                            ko7 ko7VarC = eo7.c(0.0f, 0.0f, 0.0f, 16.0f + composerHalfSize, 7);
                            contentRow = (ContentRow) th1.H(list);
                            if (!(contentRow instanceof ContentRow.FooterNoticeRow) || (contentRow instanceof ContentRow.ComposerSuggestionRow) || (contentRow instanceof ContentRow.QuickRepliesRow)) {
                                lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                            } else {
                                lVarItemAtBottom = c30.c;
                            }
                            c30.l lVar = lVarItemAtBottom;
                            bj4VarO.K(-1167237254);
                            boolean zJ5 = bj4VarO.j(list);
                            if ((234881024 & i38) == 67108864) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            boolean z29 = zJ5 | z15;
                            if ((i38 & 7168) == 2048) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            boolean z30 = z29 | z16;
                            if ((i38 & 57344) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean z31 = z30 | z17;
                            if ((i34 & 7168) == 2048) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            boolean z32 = z31 | z18;
                            if ((i34 & 57344) == 16384) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z33 = z32 | z19;
                            if ((i34 & 458752) == 131072) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            boolean z34 = z33 | z20 | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                            if ((i34 & 112) == 32) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            boolean z35 = z21 | z34;
                            if ((i38 & 458752) == 131072) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            boolean z36 = z35 | z22;
                            if ((29360128 & i38) == 8388608) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            boolean z37 = z36 | z23;
                            if ((3670016 & i38) == 1048576) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            zJ2 = z37 | z24 | ((1879048192 & i38) == 536870912) | bj4VarO.j(context);
                            Object objF16 = bj4VarO.f();
                            if (!zJ2 || objF16 == obj) {
                                oh4Var24 = oh4Var20;
                                oh4Var25 = oh4Var21;
                                oh4Var26 = oh4Var23;
                                oh4Var27 = oh4Var18;
                                z25 = z7;
                                mh4Var7 = mh4Var4;
                                oh4Var28 = oh4Var22;
                                final h37 h37Var3 = h37Var2;
                                ci4Var3 = ci4Var2;
                                oh4Var29 = oh4Var19;
                                mh4Var8 = mh4Var6;
                                oh4Var30 = oh4Var16;
                                obj2 = new oh4() { // from class: tz5
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj3) {
                                        return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var3, g27Var, (bz5) obj3);
                                    }
                                };
                                bj4 bj4Var3 = bj4VarO;
                                bj4Var3.C(obj2);
                                bj4Var = bj4Var3;
                            } else {
                                oh4Var29 = oh4Var19;
                                oh4Var24 = oh4Var20;
                                mh4Var8 = mh4Var6;
                                oh4Var30 = oh4Var16;
                                oh4Var25 = oh4Var21;
                                oh4Var26 = oh4Var23;
                                bj4Var = bj4VarO;
                                obj2 = objF16;
                                oh4Var27 = oh4Var18;
                                z25 = z7;
                                mh4Var7 = mh4Var4;
                                oh4Var28 = oh4Var22;
                                ci4Var3 = ci4Var2;
                            }
                            bj4Var.U(false);
                            ys5.a(ox6VarH, nz5Var5, ko7VarC, lVar, di.a.n, null, false, null, (oh4) obj2, bj4Var, 199680 | (i43 & 112), 448);
                            ci4Var4 = ci4Var3;
                            z26 = z25;
                            mh4Var9 = mh4Var7;
                            oh4Var31 = oh4Var30;
                            oh4Var11 = oh4Var24;
                            oh4Var32 = oh4Var26;
                            z27 = z8;
                            oh4Var33 = oh4Var28;
                            oh4Var34 = oh4Var27;
                            mh4Var10 = mh4Var8;
                            oh4Var35 = oh4Var25;
                            nz5Var6 = nz5Var5;
                            oh4Var36 = oh4Var29;
                            z28 = z4;
                            bj4Var2 = bj4Var;
                        } else {
                            nz5Var4 = nz5Var3;
                        }
                        z11 = true;
                        z12 = z11 | zJ4;
                        objF12 = bj4VarO.f();
                        if (z12) {
                            nz5 nz5Var8 = nz5Var4;
                            objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var8, yz9VarKeyboardAsState, h37Var, b27Var, null);
                            nz5Var5 = nz5Var8;
                            h37Var2 = h37Var;
                            bj4VarO.C(objF12);
                        } else {
                            nz5 nz5Var9 = nz5Var4;
                            objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var9, yz9VarKeyboardAsState, h37Var, b27Var, null);
                            nz5Var5 = nz5Var9;
                            h37Var2 = h37Var;
                            bj4VarO.C(objF12);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF12, boolValueOf3);
                        bj4VarO.K(-1167291782);
                        if (i39 <= 256) {
                        }
                        objF13 = bj4VarO.f();
                        if (z13) {
                            objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                            bj4VarO.C(objF13);
                        } else {
                            objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                            bj4VarO.C(objF13);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF13, nz5Var5);
                        bj4VarO.K(-1167285484);
                        if (i39 <= 256) {
                        }
                        objF14 = bj4VarO.f();
                        if (z14) {
                            objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                            bj4VarO.C(objF14);
                        } else {
                            objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                            bj4VarO.C(objF14);
                        }
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF14, nz5Var5);
                        bj4VarO.K(-1167277270);
                        zJ = bj4VarO.j(list) | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                        objF15 = bj4VarO.f();
                        if (zJ) {
                            objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                            bj4VarO.C(objF15);
                        } else {
                            objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                            bj4VarO.C(objF15);
                        }
                        bj4VarO.U(false);
                        int i44 = i38 >> 3;
                        wd3.d(bj4VarO, (ci4) objF15, list);
                        ox6 ox6VarH2 = ox6Var3.H(ir9.c);
                        if (z4) {
                            composerHalfSize = MessageComposerKt.getComposerHalfSize();
                        } else {
                            composerHalfSize = 0.0f;
                        }
                        ko7 ko7VarC2 = eo7.c(0.0f, 0.0f, 0.0f, 16.0f + composerHalfSize, 7);
                        contentRow = (ContentRow) th1.H(list);
                        if (contentRow instanceof ContentRow.FooterNoticeRow) {
                            lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                        } else {
                            lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                        }
                        c30.l lVar2 = lVarItemAtBottom;
                        bj4VarO.K(-1167237254);
                        boolean zJ6 = bj4VarO.j(list);
                        if ((234881024 & i38) == 67108864) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z210 = zJ6 | z15;
                        if ((i38 & 7168) == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z38 = z210 | z16;
                        if ((i38 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z39 = z38 | z17;
                        if ((i34 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean z310 = z39 | z18;
                        if ((i34 & 57344) == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z311 = z310 | z19;
                        if ((i34 & 458752) == 131072) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        boolean z312 = z311 | z20 | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                        if ((i34 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        boolean z313 = z21 | z312;
                        if ((i38 & 458752) == 131072) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        boolean z314 = z313 | z22;
                        if ((29360128 & i38) == 8388608) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        boolean z315 = z314 | z23;
                        if ((3670016 & i38) == 1048576) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        zJ2 = z315 | z24 | ((1879048192 & i38) == 536870912) | bj4VarO.j(context);
                        Object objF17 = bj4VarO.f();
                        if (zJ2) {
                            oh4Var24 = oh4Var20;
                            oh4Var25 = oh4Var21;
                            oh4Var26 = oh4Var23;
                            oh4Var27 = oh4Var18;
                            z25 = z7;
                            mh4Var7 = mh4Var4;
                            oh4Var28 = oh4Var22;
                            final h37 h37Var4 = h37Var2;
                            ci4Var3 = ci4Var2;
                            oh4Var29 = oh4Var19;
                            mh4Var8 = mh4Var6;
                            oh4Var30 = oh4Var16;
                            obj2 = new oh4() { // from class: tz5
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj3) {
                                    return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var4, g27Var, (bz5) obj3);
                                }
                            };
                            bj4 bj4Var4 = bj4VarO;
                            bj4Var4.C(obj2);
                            bj4Var = bj4Var4;
                        } else {
                            oh4Var24 = oh4Var20;
                            oh4Var25 = oh4Var21;
                            oh4Var26 = oh4Var23;
                            oh4Var27 = oh4Var18;
                            z25 = z7;
                            mh4Var7 = mh4Var4;
                            oh4Var28 = oh4Var22;
                            final h37 h37Var5 = h37Var2;
                            ci4Var3 = ci4Var2;
                            oh4Var29 = oh4Var19;
                            mh4Var8 = mh4Var6;
                            oh4Var30 = oh4Var16;
                            obj2 = new oh4() { // from class: tz5
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj3) {
                                    return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var5, g27Var, (bz5) obj3);
                                }
                            };
                            bj4 bj4Var5 = bj4VarO;
                            bj4Var5.C(obj2);
                            bj4Var = bj4Var5;
                        }
                        bj4Var.U(false);
                        ys5.a(ox6VarH2, nz5Var5, ko7VarC2, lVar2, di.a.n, null, false, null, (oh4) obj2, bj4Var, 199680 | (i44 & 112), 448);
                        ci4Var4 = ci4Var3;
                        z26 = z25;
                        mh4Var9 = mh4Var7;
                        oh4Var31 = oh4Var30;
                        oh4Var11 = oh4Var24;
                        oh4Var32 = oh4Var26;
                        z27 = z8;
                        oh4Var33 = oh4Var28;
                        oh4Var34 = oh4Var27;
                        mh4Var10 = mh4Var8;
                        oh4Var35 = oh4Var25;
                        nz5Var6 = nz5Var5;
                        oh4Var36 = oh4Var29;
                        z28 = z4;
                        bj4Var2 = bj4Var;
                    } else {
                        nz5Var3 = nz5Var2;
                    }
                    z9 = true;
                    z10 = zJ3 | z9;
                    objF11 = bj4VarO.f();
                    if (z10) {
                        objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                        bj4VarO.C(objF11);
                    } else {
                        objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                        bj4VarO.C(objF11);
                    }
                    oh4Var23 = oh4Var17;
                    bj4VarO.U(false);
                    wd3.f(boolValueOf, boolValueOf2, (ci4) objF11, bj4VarO);
                    Boolean boolValueOf4 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isDismissed());
                    bj4VarO.K(-1167299697);
                    boolean zJ7 = bj4VarO.J(yz9VarKeyboardAsState);
                    if (i39 > 256) {
                        nz5Var4 = nz5Var3;
                        if ((i38 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        nz5Var4 = nz5Var3;
                        if ((i38 & 384) != 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    z12 = z11 | zJ7;
                    objF12 = bj4VarO.f();
                    if (z12) {
                        nz5 nz5Var10 = nz5Var4;
                        objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var10, yz9VarKeyboardAsState, h37Var, b27Var, null);
                        nz5Var5 = nz5Var10;
                        h37Var2 = h37Var;
                        bj4VarO.C(objF12);
                    } else {
                        nz5 nz5Var11 = nz5Var4;
                        objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var11, yz9VarKeyboardAsState, h37Var, b27Var, null);
                        nz5Var5 = nz5Var11;
                        h37Var2 = h37Var;
                        bj4VarO.C(objF12);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF12, boolValueOf4);
                    bj4VarO.K(-1167291782);
                    if (i39 <= 256) {
                    }
                    objF13 = bj4VarO.f();
                    if (z13) {
                        objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                        bj4VarO.C(objF13);
                    } else {
                        objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                        bj4VarO.C(objF13);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF13, nz5Var5);
                    bj4VarO.K(-1167285484);
                    if (i39 <= 256) {
                    }
                    objF14 = bj4VarO.f();
                    if (z14) {
                        objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                        bj4VarO.C(objF14);
                    } else {
                        objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                        bj4VarO.C(objF14);
                    }
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF14, nz5Var5);
                    bj4VarO.K(-1167277270);
                    zJ = bj4VarO.j(list) | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                    objF15 = bj4VarO.f();
                    if (zJ) {
                        objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                        bj4VarO.C(objF15);
                    } else {
                        objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                        bj4VarO.C(objF15);
                    }
                    bj4VarO.U(false);
                    int i45 = i38 >> 3;
                    wd3.d(bj4VarO, (ci4) objF15, list);
                    ox6 ox6VarH3 = ox6Var3.H(ir9.c);
                    if (z4) {
                        composerHalfSize = MessageComposerKt.getComposerHalfSize();
                    } else {
                        composerHalfSize = 0.0f;
                    }
                    ko7 ko7VarC3 = eo7.c(0.0f, 0.0f, 0.0f, 16.0f + composerHalfSize, 7);
                    contentRow = (ContentRow) th1.H(list);
                    if (contentRow instanceof ContentRow.FooterNoticeRow) {
                        lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                    } else {
                        lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                    }
                    c30.l lVar3 = lVarItemAtBottom;
                    bj4VarO.K(-1167237254);
                    boolean zJ8 = bj4VarO.j(list);
                    if ((234881024 & i38) == 67108864) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z211 = zJ8 | z15;
                    if ((i38 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z316 = z211 | z16;
                    if ((i38 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z317 = z316 | z17;
                    if ((i34 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z318 = z317 | z18;
                    if ((i34 & 57344) == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z319 = z318 | z19;
                    if ((i34 & 458752) == 131072) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    boolean z3110 = z319 | z20 | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                    if ((i34 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean z3111 = z21 | z3110;
                    if ((i38 & 458752) == 131072) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    boolean z3112 = z3111 | z22;
                    if ((29360128 & i38) == 8388608) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    boolean z3113 = z3112 | z23;
                    if ((3670016 & i38) == 1048576) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    zJ2 = z3113 | z24 | ((1879048192 & i38) == 536870912) | bj4VarO.j(context);
                    Object objF18 = bj4VarO.f();
                    if (zJ2) {
                        oh4Var24 = oh4Var20;
                        oh4Var25 = oh4Var21;
                        oh4Var26 = oh4Var23;
                        oh4Var27 = oh4Var18;
                        z25 = z7;
                        mh4Var7 = mh4Var4;
                        oh4Var28 = oh4Var22;
                        final h37 h37Var6 = h37Var2;
                        ci4Var3 = ci4Var2;
                        oh4Var29 = oh4Var19;
                        mh4Var8 = mh4Var6;
                        oh4Var30 = oh4Var16;
                        obj2 = new oh4() { // from class: tz5
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj3) {
                                return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var6, g27Var, (bz5) obj3);
                            }
                        };
                        bj4 bj4Var6 = bj4VarO;
                        bj4Var6.C(obj2);
                        bj4Var = bj4Var6;
                    } else {
                        oh4Var24 = oh4Var20;
                        oh4Var25 = oh4Var21;
                        oh4Var26 = oh4Var23;
                        oh4Var27 = oh4Var18;
                        z25 = z7;
                        mh4Var7 = mh4Var4;
                        oh4Var28 = oh4Var22;
                        final h37 h37Var7 = h37Var2;
                        ci4Var3 = ci4Var2;
                        oh4Var29 = oh4Var19;
                        mh4Var8 = mh4Var6;
                        oh4Var30 = oh4Var16;
                        obj2 = new oh4() { // from class: tz5
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj3) {
                                return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var7, g27Var, (bz5) obj3);
                            }
                        };
                        bj4 bj4Var7 = bj4VarO;
                        bj4Var7.C(obj2);
                        bj4Var = bj4Var7;
                    }
                    bj4Var.U(false);
                    ys5.a(ox6VarH3, nz5Var5, ko7VarC3, lVar3, di.a.n, null, false, null, (oh4) obj2, bj4Var, 199680 | (i45 & 112), 448);
                    ci4Var4 = ci4Var3;
                    z26 = z25;
                    mh4Var9 = mh4Var7;
                    oh4Var31 = oh4Var30;
                    oh4Var11 = oh4Var24;
                    oh4Var32 = oh4Var26;
                    z27 = z8;
                    oh4Var33 = oh4Var28;
                    oh4Var34 = oh4Var27;
                    mh4Var10 = mh4Var8;
                    oh4Var35 = oh4Var25;
                    nz5Var6 = nz5Var5;
                    oh4Var36 = oh4Var29;
                    z28 = z4;
                    bj4Var2 = bj4Var;
                }
                xj8VarW = bj4Var2.W();
                if (xj8VarW != null) {
                    final ox6 ox6Var4 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: vz5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return LazyMessageListKt.LazyMessageList$lambda$41(ox6Var4, list, nz5Var6, oh4Var35, oh4Var33, oh4Var31, oh4Var11, oh4Var36, mh4Var10, oh4Var32, z28, oh4Var34, z27, ci4Var4, z26, mh4Var9, i, i2, i3, (jt1) obj3, iIntValue);
                        }
                    };
                }
            }
            i4 |= 24576;
            oh4Var9 = oh4Var2;
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                oh4Var10 = oh4Var3;
            } else {
                oh4Var10 = oh4Var3;
                if ((i & 196608) == 0) {
                    if (bj4VarO.j(oh4Var10)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                oh4Var11 = oh4Var4;
            } else {
                oh4Var11 = oh4Var4;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.j(oh4Var11)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
                oh4Var12 = oh4Var5;
            } else {
                oh4Var12 = oh4Var5;
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(oh4Var12)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i4 |= i14;
            }
            i15 = i3 & 512;
            if (i15 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (bj4VarO.j(oh4Var6)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i4 |= i16;
            }
            i17 = i3 & 1024;
            if (i17 != 0) {
                i18 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (bj4VarO.c(z)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i2 | i19;
            } else {
                i18 = i2;
            }
            i20 = i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i2 & 48) != 0) {
                if (bj4VarO.j(oh4Var7)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i3 & 4096;
            if (i23 != 0) {
                i25 = i22 | 384;
            } else {
                i24 = i22;
                if ((i2 & 384) != 0) {
                    if (bj4VarO.c(z2)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i24 |= i26;
                }
                i25 = i24;
            }
            i27 = i3 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    i29 = i28 | (bj4VarO.j(ci4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
                } else {
                    i29 = i28;
                }
            }
            i30 = i3 & 16384;
            if (i30 != 0) {
                i32 = i29 | 24576;
            } else {
                i31 = i29;
                if ((i2 & 24576) == 0) {
                    i32 = i31 | (bj4VarO.c(z3) ? 16384 : 8192);
                } else {
                    i32 = i31;
                }
            }
            i33 = i3 & 32768;
            if (i33 != 0) {
                i32 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i32 |= bj4VarO.j(mh4Var2) ? 131072 : 65536;
            }
            i34 = i32;
            if ((i4 & 306783379) != 306783378) {
                bj4VarO.v0();
                i35 = i & 1;
                obj = jt1.a.a;
                if (i35 != 0) {
                    if (i40 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    i36 = 3;
                    if ((i3 & 4) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i4 &= -897;
                    }
                    if (i42 != 0) {
                        bj4VarO.K(-1167352612);
                        objF9 = bj4VarO.f();
                        if (objF9 == obj) {
                            objF9 = new sz5();
                            bj4VarO.C(objF9);
                        }
                        oh4Var8 = (oh4) objF9;
                        bj4VarO.U(false);
                    }
                    if (i5 != 0) {
                        bj4VarO.K(-1167351076);
                        objF8 = bj4VarO.f();
                        if (objF8 == obj) {
                            objF8 = new d42(2);
                            bj4VarO.C(objF8);
                        }
                        oh4Var9 = (oh4) objF8;
                        bj4VarO.U(false);
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-1167349540);
                        objF7 = bj4VarO.f();
                        if (objF7 == obj) {
                            objF7 = new bx0(i36);
                            bj4VarO.C(objF7);
                        }
                        oh4Var10 = (oh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i9 != 0) {
                        bj4VarO.K(-1167347044);
                        objF6 = bj4VarO.f();
                        if (objF6 == obj) {
                            objF6 = new d7(2);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1167345348);
                        objF5 = bj4VarO.f();
                        if (objF5 == obj) {
                            objF5 = new e7(i36);
                            bj4VarO.C(objF5);
                        }
                        oh4Var13 = (oh4) objF5;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var12;
                    }
                    if (i13 != 0) {
                        bj4VarO.K(-1167343908);
                        objF4 = bj4VarO.f();
                        if (objF4 == obj) {
                            objF4 = new wz5();
                            bj4VarO.C(objF4);
                        }
                        mh4Var3 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var;
                    }
                    if (i15 != 0) {
                        bj4VarO.K(-1167342404);
                        objF3 = bj4VarO.f();
                        if (objF3 == obj) {
                            objF3 = new g7(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var14 = (oh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        oh4Var14 = oh4Var6;
                    }
                    if (i17 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i20 != 0) {
                        bj4VarO.K(-1167339236);
                        objF2 = bj4VarO.f();
                        if (objF2 == obj) {
                            objF2 = new h7(2);
                            bj4VarO.C(objF2);
                        }
                        oh4Var15 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var13;
                        oh4Var15 = oh4Var7;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i27 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i30 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    oh4<? super String, g2b> oh4Var38 = oh4Var15;
                    if (i33 != 0) {
                        bj4VarO.K(-1167332516);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new xz5();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        z7 = z6;
                        mh4Var4 = (mh4) objF;
                    } else {
                        z7 = z6;
                        mh4Var4 = mh4Var2;
                    }
                    z8 = z5;
                    ox6Var3 = ox6Var2;
                    i37 = i4;
                    nz5Var2 = nz5VarA;
                    oh4Var16 = oh4Var10;
                    oh4Var17 = oh4Var14;
                    oh4Var18 = oh4Var38;
                    mh4Var5 = mh4Var3;
                    oh4Var12 = oh4Var13;
                } else {
                    if (i40 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    i36 = 3;
                    if ((i3 & 4) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i4 &= -897;
                    }
                    if (i42 != 0) {
                        bj4VarO.K(-1167352612);
                        objF9 = bj4VarO.f();
                        if (objF9 == obj) {
                            objF9 = new sz5();
                            bj4VarO.C(objF9);
                        }
                        oh4Var8 = (oh4) objF9;
                        bj4VarO.U(false);
                    }
                    if (i5 != 0) {
                        bj4VarO.K(-1167351076);
                        objF8 = bj4VarO.f();
                        if (objF8 == obj) {
                            objF8 = new d42(2);
                            bj4VarO.C(objF8);
                        }
                        oh4Var9 = (oh4) objF8;
                        bj4VarO.U(false);
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-1167349540);
                        objF7 = bj4VarO.f();
                        if (objF7 == obj) {
                            objF7 = new bx0(i36);
                            bj4VarO.C(objF7);
                        }
                        oh4Var10 = (oh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i9 != 0) {
                        bj4VarO.K(-1167347044);
                        objF6 = bj4VarO.f();
                        if (objF6 == obj) {
                            objF6 = new d7(2);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1167345348);
                        objF5 = bj4VarO.f();
                        if (objF5 == obj) {
                            objF5 = new e7(i36);
                            bj4VarO.C(objF5);
                        }
                        oh4Var13 = (oh4) objF5;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var12;
                    }
                    if (i13 != 0) {
                        bj4VarO.K(-1167343908);
                        objF4 = bj4VarO.f();
                        if (objF4 == obj) {
                            objF4 = new wz5();
                            bj4VarO.C(objF4);
                        }
                        mh4Var3 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var;
                    }
                    if (i15 != 0) {
                        bj4VarO.K(-1167342404);
                        objF3 = bj4VarO.f();
                        if (objF3 == obj) {
                            objF3 = new g7(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var14 = (oh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        oh4Var14 = oh4Var6;
                    }
                    if (i17 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i20 != 0) {
                        bj4VarO.K(-1167339236);
                        objF2 = bj4VarO.f();
                        if (objF2 == obj) {
                            objF2 = new h7(2);
                            bj4VarO.C(objF2);
                        }
                        oh4Var15 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var13;
                        oh4Var15 = oh4Var7;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i27 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i30 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    oh4<? super String, g2b> oh4Var39 = oh4Var15;
                    if (i33 != 0) {
                        bj4VarO.K(-1167332516);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new xz5();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        z7 = z6;
                        mh4Var4 = (mh4) objF;
                    } else {
                        z7 = z6;
                        mh4Var4 = mh4Var2;
                    }
                    z8 = z5;
                    ox6Var3 = ox6Var2;
                    i37 = i4;
                    nz5Var2 = nz5VarA;
                    oh4Var16 = oh4Var10;
                    oh4Var17 = oh4Var14;
                    oh4Var18 = oh4Var39;
                    mh4Var5 = mh4Var3;
                    oh4Var12 = oh4Var13;
                }
                bj4VarO.V();
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                oh4Var19 = oh4Var12;
                oh4Var20 = oh4Var11;
                yz9VarKeyboardAsState = KeyboardStateKt.keyboardAsState(bj4VarO, 0);
                bj4VarO.K(-1167326626);
                objF10 = bj4VarO.f();
                mh4Var6 = mh4Var5;
                if (objF10 == obj) {
                    objF10 = new at7(0.0f);
                    bj4VarO.C(objF10);
                }
                b27Var = (b27) objF10;
                bj4VarO.U(false);
                bj4VarO.K(-1167324387);
                if (z8) {
                    r6 = 0;
                    fU0 = ((tx2) bj4VarO.F(qu1.h)).U0(PoweredByBadgeKt.getPoweredByBadgeHeight(bj4VarO, 0));
                } else {
                    r6 = 0;
                    fU0 = 0.0f;
                }
                objB = aa0.b(bj4VarO, r6, -1167319173);
                if (objB == obj) {
                    objB = new bt7(r6);
                    bj4VarO.C(objB);
                }
                g27Var = (g27) objB;
                oh4Var21 = oh4Var8;
                objB2 = aa0.b(bj4VarO, r6, -1167317156);
                if (objB2 == obj) {
                    objB2 = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objB2);
                }
                h37Var = (h37) objB2;
                bj4VarO.U(r6);
                Boolean boolValueOf5 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isVisible());
                Boolean boolValueOf6 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isAnimating());
                oh4Var22 = oh4Var9;
                bj4VarO.K(-1167312546);
                boolean zJ9 = bj4VarO.J(yz9VarKeyboardAsState) | bj4VarO.g(fU0);
                f = fU0;
                i38 = i37;
                i39 = (i38 & 896) ^ 384;
                if (i39 > 256) {
                    nz5Var3 = nz5Var2;
                    if ((i38 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else {
                    nz5Var3 = nz5Var2;
                    if ((i38 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                z10 = zJ9 | z9;
                objF11 = bj4VarO.f();
                if (z10) {
                    objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                    bj4VarO.C(objF11);
                } else {
                    objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                    bj4VarO.C(objF11);
                }
                oh4Var23 = oh4Var17;
                bj4VarO.U(false);
                wd3.f(boolValueOf5, boolValueOf6, (ci4) objF11, bj4VarO);
                Boolean boolValueOf7 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isDismissed());
                bj4VarO.K(-1167299697);
                boolean zJ10 = bj4VarO.J(yz9VarKeyboardAsState);
                if (i39 > 256) {
                    nz5Var4 = nz5Var3;
                    if ((i38 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    nz5Var4 = nz5Var3;
                    if ((i38 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                z12 = z11 | zJ10;
                objF12 = bj4VarO.f();
                if (z12) {
                    nz5 nz5Var12 = nz5Var4;
                    objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var12, yz9VarKeyboardAsState, h37Var, b27Var, null);
                    nz5Var5 = nz5Var12;
                    h37Var2 = h37Var;
                    bj4VarO.C(objF12);
                } else {
                    nz5 nz5Var13 = nz5Var4;
                    objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var13, yz9VarKeyboardAsState, h37Var, b27Var, null);
                    nz5Var5 = nz5Var13;
                    h37Var2 = h37Var;
                    bj4VarO.C(objF12);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF12, boolValueOf7);
                bj4VarO.K(-1167291782);
                if (i39 <= 256) {
                }
                objF13 = bj4VarO.f();
                if (z13) {
                    objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                    bj4VarO.C(objF13);
                } else {
                    objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                    bj4VarO.C(objF13);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF13, nz5Var5);
                bj4VarO.K(-1167285484);
                if (i39 <= 256) {
                }
                objF14 = bj4VarO.f();
                if (z14) {
                    objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                    bj4VarO.C(objF14);
                } else {
                    objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                    bj4VarO.C(objF14);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF14, nz5Var5);
                bj4VarO.K(-1167277270);
                zJ = bj4VarO.j(list) | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                objF15 = bj4VarO.f();
                if (zJ) {
                    objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                    bj4VarO.C(objF15);
                } else {
                    objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                    bj4VarO.C(objF15);
                }
                bj4VarO.U(false);
                int i46 = i38 >> 3;
                wd3.d(bj4VarO, (ci4) objF15, list);
                ox6 ox6VarH4 = ox6Var3.H(ir9.c);
                if (z4) {
                    composerHalfSize = MessageComposerKt.getComposerHalfSize();
                } else {
                    composerHalfSize = 0.0f;
                }
                ko7 ko7VarC4 = eo7.c(0.0f, 0.0f, 0.0f, 16.0f + composerHalfSize, 7);
                contentRow = (ContentRow) th1.H(list);
                if (contentRow instanceof ContentRow.FooterNoticeRow) {
                    lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                } else {
                    lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                }
                c30.l lVar4 = lVarItemAtBottom;
                bj4VarO.K(-1167237254);
                boolean zJ11 = bj4VarO.j(list);
                if ((234881024 & i38) == 67108864) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z212 = zJ11 | z15;
                if ((i38 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z3114 = z212 | z16;
                if ((i38 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z3115 = z3114 | z17;
                if ((i34 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z3116 = z3115 | z18;
                if ((i34 & 57344) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z3117 = z3116 | z19;
                if ((i34 & 458752) == 131072) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z3118 = z3117 | z20 | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                if ((i34 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean z3119 = z21 | z3118;
                if ((i38 & 458752) == 131072) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z31110 = z3119 | z22;
                if ((29360128 & i38) == 8388608) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean z31111 = z31110 | z23;
                if ((3670016 & i38) == 1048576) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zJ2 = z31111 | z24 | ((1879048192 & i38) == 536870912) | bj4VarO.j(context);
                Object objF19 = bj4VarO.f();
                if (zJ2) {
                    oh4Var24 = oh4Var20;
                    oh4Var25 = oh4Var21;
                    oh4Var26 = oh4Var23;
                    oh4Var27 = oh4Var18;
                    z25 = z7;
                    mh4Var7 = mh4Var4;
                    oh4Var28 = oh4Var22;
                    final h37 h37Var8 = h37Var2;
                    ci4Var3 = ci4Var2;
                    oh4Var29 = oh4Var19;
                    mh4Var8 = mh4Var6;
                    oh4Var30 = oh4Var16;
                    obj2 = new oh4() { // from class: tz5
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj3) {
                            return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var8, g27Var, (bz5) obj3);
                        }
                    };
                    bj4 bj4Var8 = bj4VarO;
                    bj4Var8.C(obj2);
                    bj4Var = bj4Var8;
                } else {
                    oh4Var24 = oh4Var20;
                    oh4Var25 = oh4Var21;
                    oh4Var26 = oh4Var23;
                    oh4Var27 = oh4Var18;
                    z25 = z7;
                    mh4Var7 = mh4Var4;
                    oh4Var28 = oh4Var22;
                    final h37 h37Var9 = h37Var2;
                    ci4Var3 = ci4Var2;
                    oh4Var29 = oh4Var19;
                    mh4Var8 = mh4Var6;
                    oh4Var30 = oh4Var16;
                    obj2 = new oh4() { // from class: tz5
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj3) {
                            return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var9, g27Var, (bz5) obj3);
                        }
                    };
                    bj4 bj4Var9 = bj4VarO;
                    bj4Var9.C(obj2);
                    bj4Var = bj4Var9;
                }
                bj4Var.U(false);
                ys5.a(ox6VarH4, nz5Var5, ko7VarC4, lVar4, di.a.n, null, false, null, (oh4) obj2, bj4Var, 199680 | (i46 & 112), 448);
                ci4Var4 = ci4Var3;
                z26 = z25;
                mh4Var9 = mh4Var7;
                oh4Var31 = oh4Var30;
                oh4Var11 = oh4Var24;
                oh4Var32 = oh4Var26;
                z27 = z8;
                oh4Var33 = oh4Var28;
                oh4Var34 = oh4Var27;
                mh4Var10 = mh4Var8;
                oh4Var35 = oh4Var25;
                nz5Var6 = nz5Var5;
                oh4Var36 = oh4Var29;
                z28 = z4;
                bj4Var2 = bj4Var;
            } else {
                bj4VarO.v0();
                i35 = i & 1;
                obj = jt1.a.a;
                if (i35 != 0) {
                    if (i40 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    i36 = 3;
                    if ((i3 & 4) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i4 &= -897;
                    }
                    if (i42 != 0) {
                        bj4VarO.K(-1167352612);
                        objF9 = bj4VarO.f();
                        if (objF9 == obj) {
                            objF9 = new sz5();
                            bj4VarO.C(objF9);
                        }
                        oh4Var8 = (oh4) objF9;
                        bj4VarO.U(false);
                    }
                    if (i5 != 0) {
                        bj4VarO.K(-1167351076);
                        objF8 = bj4VarO.f();
                        if (objF8 == obj) {
                            objF8 = new d42(2);
                            bj4VarO.C(objF8);
                        }
                        oh4Var9 = (oh4) objF8;
                        bj4VarO.U(false);
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-1167349540);
                        objF7 = bj4VarO.f();
                        if (objF7 == obj) {
                            objF7 = new bx0(i36);
                            bj4VarO.C(objF7);
                        }
                        oh4Var10 = (oh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i9 != 0) {
                        bj4VarO.K(-1167347044);
                        objF6 = bj4VarO.f();
                        if (objF6 == obj) {
                            objF6 = new d7(2);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1167345348);
                        objF5 = bj4VarO.f();
                        if (objF5 == obj) {
                            objF5 = new e7(i36);
                            bj4VarO.C(objF5);
                        }
                        oh4Var13 = (oh4) objF5;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var12;
                    }
                    if (i13 != 0) {
                        bj4VarO.K(-1167343908);
                        objF4 = bj4VarO.f();
                        if (objF4 == obj) {
                            objF4 = new wz5();
                            bj4VarO.C(objF4);
                        }
                        mh4Var3 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var;
                    }
                    if (i15 != 0) {
                        bj4VarO.K(-1167342404);
                        objF3 = bj4VarO.f();
                        if (objF3 == obj) {
                            objF3 = new g7(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var14 = (oh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        oh4Var14 = oh4Var6;
                    }
                    if (i17 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i20 != 0) {
                        bj4VarO.K(-1167339236);
                        objF2 = bj4VarO.f();
                        if (objF2 == obj) {
                            objF2 = new h7(2);
                            bj4VarO.C(objF2);
                        }
                        oh4Var15 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var13;
                        oh4Var15 = oh4Var7;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i27 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i30 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    oh4<? super String, g2b> oh4Var310 = oh4Var15;
                    if (i33 != 0) {
                        bj4VarO.K(-1167332516);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new xz5();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        z7 = z6;
                        mh4Var4 = (mh4) objF;
                    } else {
                        z7 = z6;
                        mh4Var4 = mh4Var2;
                    }
                    z8 = z5;
                    ox6Var3 = ox6Var2;
                    i37 = i4;
                    nz5Var2 = nz5VarA;
                    oh4Var16 = oh4Var10;
                    oh4Var17 = oh4Var14;
                    oh4Var18 = oh4Var310;
                    mh4Var5 = mh4Var3;
                    oh4Var12 = oh4Var13;
                } else {
                    if (i40 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    i36 = 3;
                    if ((i3 & 4) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i4 &= -897;
                    }
                    if (i42 != 0) {
                        bj4VarO.K(-1167352612);
                        objF9 = bj4VarO.f();
                        if (objF9 == obj) {
                            objF9 = new sz5();
                            bj4VarO.C(objF9);
                        }
                        oh4Var8 = (oh4) objF9;
                        bj4VarO.U(false);
                    }
                    if (i5 != 0) {
                        bj4VarO.K(-1167351076);
                        objF8 = bj4VarO.f();
                        if (objF8 == obj) {
                            objF8 = new d42(2);
                            bj4VarO.C(objF8);
                        }
                        oh4Var9 = (oh4) objF8;
                        bj4VarO.U(false);
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-1167349540);
                        objF7 = bj4VarO.f();
                        if (objF7 == obj) {
                            objF7 = new bx0(i36);
                            bj4VarO.C(objF7);
                        }
                        oh4Var10 = (oh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i9 != 0) {
                        bj4VarO.K(-1167347044);
                        objF6 = bj4VarO.f();
                        if (objF6 == obj) {
                            objF6 = new d7(2);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1167345348);
                        objF5 = bj4VarO.f();
                        if (objF5 == obj) {
                            objF5 = new e7(i36);
                            bj4VarO.C(objF5);
                        }
                        oh4Var13 = (oh4) objF5;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var12;
                    }
                    if (i13 != 0) {
                        bj4VarO.K(-1167343908);
                        objF4 = bj4VarO.f();
                        if (objF4 == obj) {
                            objF4 = new wz5();
                            bj4VarO.C(objF4);
                        }
                        mh4Var3 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var;
                    }
                    if (i15 != 0) {
                        bj4VarO.K(-1167342404);
                        objF3 = bj4VarO.f();
                        if (objF3 == obj) {
                            objF3 = new g7(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var14 = (oh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        oh4Var14 = oh4Var6;
                    }
                    if (i17 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i20 != 0) {
                        bj4VarO.K(-1167339236);
                        objF2 = bj4VarO.f();
                        if (objF2 == obj) {
                            objF2 = new h7(2);
                            bj4VarO.C(objF2);
                        }
                        oh4Var15 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var13;
                        oh4Var15 = oh4Var7;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i27 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i30 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    oh4<? super String, g2b> oh4Var311 = oh4Var15;
                    if (i33 != 0) {
                        bj4VarO.K(-1167332516);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new xz5();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        z7 = z6;
                        mh4Var4 = (mh4) objF;
                    } else {
                        z7 = z6;
                        mh4Var4 = mh4Var2;
                    }
                    z8 = z5;
                    ox6Var3 = ox6Var2;
                    i37 = i4;
                    nz5Var2 = nz5VarA;
                    oh4Var16 = oh4Var10;
                    oh4Var17 = oh4Var14;
                    oh4Var18 = oh4Var311;
                    mh4Var5 = mh4Var3;
                    oh4Var12 = oh4Var13;
                }
                bj4VarO.V();
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                oh4Var19 = oh4Var12;
                oh4Var20 = oh4Var11;
                yz9VarKeyboardAsState = KeyboardStateKt.keyboardAsState(bj4VarO, 0);
                bj4VarO.K(-1167326626);
                objF10 = bj4VarO.f();
                mh4Var6 = mh4Var5;
                if (objF10 == obj) {
                    objF10 = new at7(0.0f);
                    bj4VarO.C(objF10);
                }
                b27Var = (b27) objF10;
                bj4VarO.U(false);
                bj4VarO.K(-1167324387);
                if (z8) {
                    r6 = 0;
                    fU0 = ((tx2) bj4VarO.F(qu1.h)).U0(PoweredByBadgeKt.getPoweredByBadgeHeight(bj4VarO, 0));
                } else {
                    r6 = 0;
                    fU0 = 0.0f;
                }
                objB = aa0.b(bj4VarO, r6, -1167319173);
                if (objB == obj) {
                    objB = new bt7(r6);
                    bj4VarO.C(objB);
                }
                g27Var = (g27) objB;
                oh4Var21 = oh4Var8;
                objB2 = aa0.b(bj4VarO, r6, -1167317156);
                if (objB2 == obj) {
                    objB2 = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objB2);
                }
                h37Var = (h37) objB2;
                bj4VarO.U(r6);
                Boolean boolValueOf8 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isVisible());
                Boolean boolValueOf9 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isAnimating());
                oh4Var22 = oh4Var9;
                bj4VarO.K(-1167312546);
                boolean zJ12 = bj4VarO.J(yz9VarKeyboardAsState) | bj4VarO.g(fU0);
                f = fU0;
                i38 = i37;
                i39 = (i38 & 896) ^ 384;
                if (i39 > 256) {
                    nz5Var3 = nz5Var2;
                    if ((i38 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else {
                    nz5Var3 = nz5Var2;
                    if ((i38 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                z10 = zJ12 | z9;
                objF11 = bj4VarO.f();
                if (z10) {
                    objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                    bj4VarO.C(objF11);
                } else {
                    objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                    bj4VarO.C(objF11);
                }
                oh4Var23 = oh4Var17;
                bj4VarO.U(false);
                wd3.f(boolValueOf8, boolValueOf9, (ci4) objF11, bj4VarO);
                Boolean boolValueOf10 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isDismissed());
                bj4VarO.K(-1167299697);
                boolean zJ13 = bj4VarO.J(yz9VarKeyboardAsState);
                if (i39 > 256) {
                    nz5Var4 = nz5Var3;
                    if ((i38 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    nz5Var4 = nz5Var3;
                    if ((i38 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                z12 = z11 | zJ13;
                objF12 = bj4VarO.f();
                if (z12) {
                    nz5 nz5Var14 = nz5Var4;
                    objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var14, yz9VarKeyboardAsState, h37Var, b27Var, null);
                    nz5Var5 = nz5Var14;
                    h37Var2 = h37Var;
                    bj4VarO.C(objF12);
                } else {
                    nz5 nz5Var15 = nz5Var4;
                    objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var15, yz9VarKeyboardAsState, h37Var, b27Var, null);
                    nz5Var5 = nz5Var15;
                    h37Var2 = h37Var;
                    bj4VarO.C(objF12);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF12, boolValueOf10);
                bj4VarO.K(-1167291782);
                if (i39 <= 256) {
                }
                objF13 = bj4VarO.f();
                if (z13) {
                    objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                    bj4VarO.C(objF13);
                } else {
                    objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                    bj4VarO.C(objF13);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF13, nz5Var5);
                bj4VarO.K(-1167285484);
                if (i39 <= 256) {
                }
                objF14 = bj4VarO.f();
                if (z14) {
                    objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                    bj4VarO.C(objF14);
                } else {
                    objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                    bj4VarO.C(objF14);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF14, nz5Var5);
                bj4VarO.K(-1167277270);
                zJ = bj4VarO.j(list) | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                objF15 = bj4VarO.f();
                if (zJ) {
                    objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                    bj4VarO.C(objF15);
                } else {
                    objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                    bj4VarO.C(objF15);
                }
                bj4VarO.U(false);
                int i47 = i38 >> 3;
                wd3.d(bj4VarO, (ci4) objF15, list);
                ox6 ox6VarH5 = ox6Var3.H(ir9.c);
                if (z4) {
                    composerHalfSize = MessageComposerKt.getComposerHalfSize();
                } else {
                    composerHalfSize = 0.0f;
                }
                ko7 ko7VarC5 = eo7.c(0.0f, 0.0f, 0.0f, 16.0f + composerHalfSize, 7);
                contentRow = (ContentRow) th1.H(list);
                if (contentRow instanceof ContentRow.FooterNoticeRow) {
                    lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                } else {
                    lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                }
                c30.l lVar5 = lVarItemAtBottom;
                bj4VarO.K(-1167237254);
                boolean zJ14 = bj4VarO.j(list);
                if ((234881024 & i38) == 67108864) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z213 = zJ14 | z15;
                if ((i38 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z31112 = z213 | z16;
                if ((i38 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z31113 = z31112 | z17;
                if ((i34 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z31114 = z31113 | z18;
                if ((i34 & 57344) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z31115 = z31114 | z19;
                if ((i34 & 458752) == 131072) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z31116 = z31115 | z20 | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                if ((i34 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean z31117 = z21 | z31116;
                if ((i38 & 458752) == 131072) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z31118 = z31117 | z22;
                if ((29360128 & i38) == 8388608) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean z31119 = z31118 | z23;
                if ((3670016 & i38) == 1048576) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zJ2 = z31119 | z24 | ((1879048192 & i38) == 536870912) | bj4VarO.j(context);
                Object objF110 = bj4VarO.f();
                if (zJ2) {
                    oh4Var24 = oh4Var20;
                    oh4Var25 = oh4Var21;
                    oh4Var26 = oh4Var23;
                    oh4Var27 = oh4Var18;
                    z25 = z7;
                    mh4Var7 = mh4Var4;
                    oh4Var28 = oh4Var22;
                    final h37 h37Var10 = h37Var2;
                    ci4Var3 = ci4Var2;
                    oh4Var29 = oh4Var19;
                    mh4Var8 = mh4Var6;
                    oh4Var30 = oh4Var16;
                    obj2 = new oh4() { // from class: tz5
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj3) {
                            return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var10, g27Var, (bz5) obj3);
                        }
                    };
                    bj4 bj4Var10 = bj4VarO;
                    bj4Var10.C(obj2);
                    bj4Var = bj4Var10;
                } else {
                    oh4Var24 = oh4Var20;
                    oh4Var25 = oh4Var21;
                    oh4Var26 = oh4Var23;
                    oh4Var27 = oh4Var18;
                    z25 = z7;
                    mh4Var7 = mh4Var4;
                    oh4Var28 = oh4Var22;
                    final h37 h37Var11 = h37Var2;
                    ci4Var3 = ci4Var2;
                    oh4Var29 = oh4Var19;
                    mh4Var8 = mh4Var6;
                    oh4Var30 = oh4Var16;
                    obj2 = new oh4() { // from class: tz5
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj3) {
                            return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var11, g27Var, (bz5) obj3);
                        }
                    };
                    bj4 bj4Var11 = bj4VarO;
                    bj4Var11.C(obj2);
                    bj4Var = bj4Var11;
                }
                bj4Var.U(false);
                ys5.a(ox6VarH5, nz5Var5, ko7VarC5, lVar5, di.a.n, null, false, null, (oh4) obj2, bj4Var, 199680 | (i47 & 112), 448);
                ci4Var4 = ci4Var3;
                z26 = z25;
                mh4Var9 = mh4Var7;
                oh4Var31 = oh4Var30;
                oh4Var11 = oh4Var24;
                oh4Var32 = oh4Var26;
                z27 = z8;
                oh4Var33 = oh4Var28;
                oh4Var34 = oh4Var27;
                mh4Var10 = mh4Var8;
                oh4Var35 = oh4Var25;
                nz5Var6 = nz5Var5;
                oh4Var36 = oh4Var29;
                z28 = z4;
                bj4Var2 = bj4Var;
            }
            xj8VarW = bj4Var2.W();
            if (xj8VarW != null) {
                final ox6 ox6Var5 = ox6Var3;
                xj8VarW.d = new ci4() { // from class: vz5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return LazyMessageListKt.LazyMessageList$lambda$41(ox6Var5, list, nz5Var6, oh4Var35, oh4Var33, oh4Var31, oh4Var11, oh4Var36, mh4Var10, oh4Var32, z28, oh4Var34, z27, ci4Var4, z26, mh4Var9, i, i2, i3, (jt1) obj3, iIntValue);
                    }
                };
            }
        }
        i4 |= 3072;
        oh4Var8 = oh4Var;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                oh4Var9 = oh4Var2;
                if (bj4VarO.j(oh4Var9)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                oh4Var10 = oh4Var3;
            } else {
                oh4Var10 = oh4Var3;
                if ((i & 196608) == 0) {
                    if (bj4VarO.j(oh4Var10)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                oh4Var11 = oh4Var4;
            } else {
                oh4Var11 = oh4Var4;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.j(oh4Var11)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
                oh4Var12 = oh4Var5;
            } else {
                oh4Var12 = oh4Var5;
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(oh4Var12)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i4 |= i14;
            }
            i15 = i3 & 512;
            if (i15 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (bj4VarO.j(oh4Var6)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i4 |= i16;
            }
            i17 = i3 & 1024;
            if (i17 != 0) {
                i18 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (bj4VarO.c(z)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i2 | i19;
            } else {
                i18 = i2;
            }
            i20 = i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            if (i20 != 0) {
                i18 |= 48;
            } else if ((i2 & 48) != 0) {
                if (bj4VarO.j(oh4Var7)) {
                    i21 = 32;
                } else {
                    i21 = 16;
                }
                i18 |= i21;
            }
            i22 = i18;
            i23 = i3 & 4096;
            if (i23 != 0) {
                i25 = i22 | 384;
            } else {
                i24 = i22;
                if ((i2 & 384) != 0) {
                    if (bj4VarO.c(z2)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i24 |= i26;
                }
                i25 = i24;
            }
            i27 = i3 & 8192;
            if (i27 != 0) {
                i29 = i25 | 3072;
            } else {
                i28 = i25;
                if ((i2 & 3072) == 0) {
                    i29 = i28 | (bj4VarO.j(ci4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
                } else {
                    i29 = i28;
                }
            }
            i30 = i3 & 16384;
            if (i30 != 0) {
                i32 = i29 | 24576;
            } else {
                i31 = i29;
                if ((i2 & 24576) == 0) {
                    i32 = i31 | (bj4VarO.c(z3) ? 16384 : 8192);
                } else {
                    i32 = i31;
                }
            }
            i33 = i3 & 32768;
            if (i33 != 0) {
                i32 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i32 |= bj4VarO.j(mh4Var2) ? 131072 : 65536;
            }
            i34 = i32;
            if ((i4 & 306783379) != 306783378) {
                bj4VarO.v0();
                i35 = i & 1;
                obj = jt1.a.a;
                if (i35 != 0) {
                    if (i40 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    i36 = 3;
                    if ((i3 & 4) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i4 &= -897;
                    }
                    if (i42 != 0) {
                        bj4VarO.K(-1167352612);
                        objF9 = bj4VarO.f();
                        if (objF9 == obj) {
                            objF9 = new sz5();
                            bj4VarO.C(objF9);
                        }
                        oh4Var8 = (oh4) objF9;
                        bj4VarO.U(false);
                    }
                    if (i5 != 0) {
                        bj4VarO.K(-1167351076);
                        objF8 = bj4VarO.f();
                        if (objF8 == obj) {
                            objF8 = new d42(2);
                            bj4VarO.C(objF8);
                        }
                        oh4Var9 = (oh4) objF8;
                        bj4VarO.U(false);
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-1167349540);
                        objF7 = bj4VarO.f();
                        if (objF7 == obj) {
                            objF7 = new bx0(i36);
                            bj4VarO.C(objF7);
                        }
                        oh4Var10 = (oh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i9 != 0) {
                        bj4VarO.K(-1167347044);
                        objF6 = bj4VarO.f();
                        if (objF6 == obj) {
                            objF6 = new d7(2);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1167345348);
                        objF5 = bj4VarO.f();
                        if (objF5 == obj) {
                            objF5 = new e7(i36);
                            bj4VarO.C(objF5);
                        }
                        oh4Var13 = (oh4) objF5;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var12;
                    }
                    if (i13 != 0) {
                        bj4VarO.K(-1167343908);
                        objF4 = bj4VarO.f();
                        if (objF4 == obj) {
                            objF4 = new wz5();
                            bj4VarO.C(objF4);
                        }
                        mh4Var3 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var;
                    }
                    if (i15 != 0) {
                        bj4VarO.K(-1167342404);
                        objF3 = bj4VarO.f();
                        if (objF3 == obj) {
                            objF3 = new g7(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var14 = (oh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        oh4Var14 = oh4Var6;
                    }
                    if (i17 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i20 != 0) {
                        bj4VarO.K(-1167339236);
                        objF2 = bj4VarO.f();
                        if (objF2 == obj) {
                            objF2 = new h7(2);
                            bj4VarO.C(objF2);
                        }
                        oh4Var15 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var13;
                        oh4Var15 = oh4Var7;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i27 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i30 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    oh4<? super String, g2b> oh4Var312 = oh4Var15;
                    if (i33 != 0) {
                        bj4VarO.K(-1167332516);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new xz5();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        z7 = z6;
                        mh4Var4 = (mh4) objF;
                    } else {
                        z7 = z6;
                        mh4Var4 = mh4Var2;
                    }
                    z8 = z5;
                    ox6Var3 = ox6Var2;
                    i37 = i4;
                    nz5Var2 = nz5VarA;
                    oh4Var16 = oh4Var10;
                    oh4Var17 = oh4Var14;
                    oh4Var18 = oh4Var312;
                    mh4Var5 = mh4Var3;
                    oh4Var12 = oh4Var13;
                } else {
                    if (i40 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    i36 = 3;
                    if ((i3 & 4) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i4 &= -897;
                    }
                    if (i42 != 0) {
                        bj4VarO.K(-1167352612);
                        objF9 = bj4VarO.f();
                        if (objF9 == obj) {
                            objF9 = new sz5();
                            bj4VarO.C(objF9);
                        }
                        oh4Var8 = (oh4) objF9;
                        bj4VarO.U(false);
                    }
                    if (i5 != 0) {
                        bj4VarO.K(-1167351076);
                        objF8 = bj4VarO.f();
                        if (objF8 == obj) {
                            objF8 = new d42(2);
                            bj4VarO.C(objF8);
                        }
                        oh4Var9 = (oh4) objF8;
                        bj4VarO.U(false);
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-1167349540);
                        objF7 = bj4VarO.f();
                        if (objF7 == obj) {
                            objF7 = new bx0(i36);
                            bj4VarO.C(objF7);
                        }
                        oh4Var10 = (oh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i9 != 0) {
                        bj4VarO.K(-1167347044);
                        objF6 = bj4VarO.f();
                        if (objF6 == obj) {
                            objF6 = new d7(2);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1167345348);
                        objF5 = bj4VarO.f();
                        if (objF5 == obj) {
                            objF5 = new e7(i36);
                            bj4VarO.C(objF5);
                        }
                        oh4Var13 = (oh4) objF5;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var12;
                    }
                    if (i13 != 0) {
                        bj4VarO.K(-1167343908);
                        objF4 = bj4VarO.f();
                        if (objF4 == obj) {
                            objF4 = new wz5();
                            bj4VarO.C(objF4);
                        }
                        mh4Var3 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var;
                    }
                    if (i15 != 0) {
                        bj4VarO.K(-1167342404);
                        objF3 = bj4VarO.f();
                        if (objF3 == obj) {
                            objF3 = new g7(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var14 = (oh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        oh4Var14 = oh4Var6;
                    }
                    if (i17 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i20 != 0) {
                        bj4VarO.K(-1167339236);
                        objF2 = bj4VarO.f();
                        if (objF2 == obj) {
                            objF2 = new h7(2);
                            bj4VarO.C(objF2);
                        }
                        oh4Var15 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var13;
                        oh4Var15 = oh4Var7;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i27 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i30 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    oh4<? super String, g2b> oh4Var313 = oh4Var15;
                    if (i33 != 0) {
                        bj4VarO.K(-1167332516);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new xz5();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        z7 = z6;
                        mh4Var4 = (mh4) objF;
                    } else {
                        z7 = z6;
                        mh4Var4 = mh4Var2;
                    }
                    z8 = z5;
                    ox6Var3 = ox6Var2;
                    i37 = i4;
                    nz5Var2 = nz5VarA;
                    oh4Var16 = oh4Var10;
                    oh4Var17 = oh4Var14;
                    oh4Var18 = oh4Var313;
                    mh4Var5 = mh4Var3;
                    oh4Var12 = oh4Var13;
                }
                bj4VarO.V();
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                oh4Var19 = oh4Var12;
                oh4Var20 = oh4Var11;
                yz9VarKeyboardAsState = KeyboardStateKt.keyboardAsState(bj4VarO, 0);
                bj4VarO.K(-1167326626);
                objF10 = bj4VarO.f();
                mh4Var6 = mh4Var5;
                if (objF10 == obj) {
                    objF10 = new at7(0.0f);
                    bj4VarO.C(objF10);
                }
                b27Var = (b27) objF10;
                bj4VarO.U(false);
                bj4VarO.K(-1167324387);
                if (z8) {
                    r6 = 0;
                    fU0 = ((tx2) bj4VarO.F(qu1.h)).U0(PoweredByBadgeKt.getPoweredByBadgeHeight(bj4VarO, 0));
                } else {
                    r6 = 0;
                    fU0 = 0.0f;
                }
                objB = aa0.b(bj4VarO, r6, -1167319173);
                if (objB == obj) {
                    objB = new bt7(r6);
                    bj4VarO.C(objB);
                }
                g27Var = (g27) objB;
                oh4Var21 = oh4Var8;
                objB2 = aa0.b(bj4VarO, r6, -1167317156);
                if (objB2 == obj) {
                    objB2 = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objB2);
                }
                h37Var = (h37) objB2;
                bj4VarO.U(r6);
                Boolean boolValueOf11 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isVisible());
                Boolean boolValueOf12 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isAnimating());
                oh4Var22 = oh4Var9;
                bj4VarO.K(-1167312546);
                boolean zJ15 = bj4VarO.J(yz9VarKeyboardAsState) | bj4VarO.g(fU0);
                f = fU0;
                i38 = i37;
                i39 = (i38 & 896) ^ 384;
                if (i39 > 256) {
                    nz5Var3 = nz5Var2;
                    if ((i38 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else {
                    nz5Var3 = nz5Var2;
                    if ((i38 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                z10 = zJ15 | z9;
                objF11 = bj4VarO.f();
                if (z10) {
                    objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                    bj4VarO.C(objF11);
                } else {
                    objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                    bj4VarO.C(objF11);
                }
                oh4Var23 = oh4Var17;
                bj4VarO.U(false);
                wd3.f(boolValueOf11, boolValueOf12, (ci4) objF11, bj4VarO);
                Boolean boolValueOf13 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isDismissed());
                bj4VarO.K(-1167299697);
                boolean zJ16 = bj4VarO.J(yz9VarKeyboardAsState);
                if (i39 > 256) {
                    nz5Var4 = nz5Var3;
                    if ((i38 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    nz5Var4 = nz5Var3;
                    if ((i38 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                z12 = z11 | zJ16;
                objF12 = bj4VarO.f();
                if (z12) {
                    nz5 nz5Var16 = nz5Var4;
                    objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var16, yz9VarKeyboardAsState, h37Var, b27Var, null);
                    nz5Var5 = nz5Var16;
                    h37Var2 = h37Var;
                    bj4VarO.C(objF12);
                } else {
                    nz5 nz5Var17 = nz5Var4;
                    objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var17, yz9VarKeyboardAsState, h37Var, b27Var, null);
                    nz5Var5 = nz5Var17;
                    h37Var2 = h37Var;
                    bj4VarO.C(objF12);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF12, boolValueOf13);
                bj4VarO.K(-1167291782);
                if (i39 <= 256) {
                }
                objF13 = bj4VarO.f();
                if (z13) {
                    objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                    bj4VarO.C(objF13);
                } else {
                    objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                    bj4VarO.C(objF13);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF13, nz5Var5);
                bj4VarO.K(-1167285484);
                if (i39 <= 256) {
                }
                objF14 = bj4VarO.f();
                if (z14) {
                    objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                    bj4VarO.C(objF14);
                } else {
                    objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                    bj4VarO.C(objF14);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF14, nz5Var5);
                bj4VarO.K(-1167277270);
                zJ = bj4VarO.j(list) | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                objF15 = bj4VarO.f();
                if (zJ) {
                    objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                    bj4VarO.C(objF15);
                } else {
                    objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                    bj4VarO.C(objF15);
                }
                bj4VarO.U(false);
                int i48 = i38 >> 3;
                wd3.d(bj4VarO, (ci4) objF15, list);
                ox6 ox6VarH6 = ox6Var3.H(ir9.c);
                if (z4) {
                    composerHalfSize = MessageComposerKt.getComposerHalfSize();
                } else {
                    composerHalfSize = 0.0f;
                }
                ko7 ko7VarC6 = eo7.c(0.0f, 0.0f, 0.0f, 16.0f + composerHalfSize, 7);
                contentRow = (ContentRow) th1.H(list);
                if (contentRow instanceof ContentRow.FooterNoticeRow) {
                    lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                } else {
                    lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                }
                c30.l lVar6 = lVarItemAtBottom;
                bj4VarO.K(-1167237254);
                boolean zJ17 = bj4VarO.j(list);
                if ((234881024 & i38) == 67108864) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z214 = zJ17 | z15;
                if ((i38 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z311110 = z214 | z16;
                if ((i38 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z311111 = z311110 | z17;
                if ((i34 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z311112 = z311111 | z18;
                if ((i34 & 57344) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z311113 = z311112 | z19;
                if ((i34 & 458752) == 131072) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z311114 = z311113 | z20 | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                if ((i34 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean z311115 = z21 | z311114;
                if ((i38 & 458752) == 131072) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z311116 = z311115 | z22;
                if ((29360128 & i38) == 8388608) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean z311117 = z311116 | z23;
                if ((3670016 & i38) == 1048576) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zJ2 = z311117 | z24 | ((1879048192 & i38) == 536870912) | bj4VarO.j(context);
                Object objF111 = bj4VarO.f();
                if (zJ2) {
                    oh4Var24 = oh4Var20;
                    oh4Var25 = oh4Var21;
                    oh4Var26 = oh4Var23;
                    oh4Var27 = oh4Var18;
                    z25 = z7;
                    mh4Var7 = mh4Var4;
                    oh4Var28 = oh4Var22;
                    final h37 h37Var12 = h37Var2;
                    ci4Var3 = ci4Var2;
                    oh4Var29 = oh4Var19;
                    mh4Var8 = mh4Var6;
                    oh4Var30 = oh4Var16;
                    obj2 = new oh4() { // from class: tz5
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj3) {
                            return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var12, g27Var, (bz5) obj3);
                        }
                    };
                    bj4 bj4Var12 = bj4VarO;
                    bj4Var12.C(obj2);
                    bj4Var = bj4Var12;
                } else {
                    oh4Var24 = oh4Var20;
                    oh4Var25 = oh4Var21;
                    oh4Var26 = oh4Var23;
                    oh4Var27 = oh4Var18;
                    z25 = z7;
                    mh4Var7 = mh4Var4;
                    oh4Var28 = oh4Var22;
                    final h37 h37Var13 = h37Var2;
                    ci4Var3 = ci4Var2;
                    oh4Var29 = oh4Var19;
                    mh4Var8 = mh4Var6;
                    oh4Var30 = oh4Var16;
                    obj2 = new oh4() { // from class: tz5
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj3) {
                            return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var13, g27Var, (bz5) obj3);
                        }
                    };
                    bj4 bj4Var13 = bj4VarO;
                    bj4Var13.C(obj2);
                    bj4Var = bj4Var13;
                }
                bj4Var.U(false);
                ys5.a(ox6VarH6, nz5Var5, ko7VarC6, lVar6, di.a.n, null, false, null, (oh4) obj2, bj4Var, 199680 | (i48 & 112), 448);
                ci4Var4 = ci4Var3;
                z26 = z25;
                mh4Var9 = mh4Var7;
                oh4Var31 = oh4Var30;
                oh4Var11 = oh4Var24;
                oh4Var32 = oh4Var26;
                z27 = z8;
                oh4Var33 = oh4Var28;
                oh4Var34 = oh4Var27;
                mh4Var10 = mh4Var8;
                oh4Var35 = oh4Var25;
                nz5Var6 = nz5Var5;
                oh4Var36 = oh4Var29;
                z28 = z4;
                bj4Var2 = bj4Var;
            } else {
                bj4VarO.v0();
                i35 = i & 1;
                obj = jt1.a.a;
                if (i35 != 0) {
                    if (i40 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    i36 = 3;
                    if ((i3 & 4) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i4 &= -897;
                    }
                    if (i42 != 0) {
                        bj4VarO.K(-1167352612);
                        objF9 = bj4VarO.f();
                        if (objF9 == obj) {
                            objF9 = new sz5();
                            bj4VarO.C(objF9);
                        }
                        oh4Var8 = (oh4) objF9;
                        bj4VarO.U(false);
                    }
                    if (i5 != 0) {
                        bj4VarO.K(-1167351076);
                        objF8 = bj4VarO.f();
                        if (objF8 == obj) {
                            objF8 = new d42(2);
                            bj4VarO.C(objF8);
                        }
                        oh4Var9 = (oh4) objF8;
                        bj4VarO.U(false);
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-1167349540);
                        objF7 = bj4VarO.f();
                        if (objF7 == obj) {
                            objF7 = new bx0(i36);
                            bj4VarO.C(objF7);
                        }
                        oh4Var10 = (oh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i9 != 0) {
                        bj4VarO.K(-1167347044);
                        objF6 = bj4VarO.f();
                        if (objF6 == obj) {
                            objF6 = new d7(2);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1167345348);
                        objF5 = bj4VarO.f();
                        if (objF5 == obj) {
                            objF5 = new e7(i36);
                            bj4VarO.C(objF5);
                        }
                        oh4Var13 = (oh4) objF5;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var12;
                    }
                    if (i13 != 0) {
                        bj4VarO.K(-1167343908);
                        objF4 = bj4VarO.f();
                        if (objF4 == obj) {
                            objF4 = new wz5();
                            bj4VarO.C(objF4);
                        }
                        mh4Var3 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var;
                    }
                    if (i15 != 0) {
                        bj4VarO.K(-1167342404);
                        objF3 = bj4VarO.f();
                        if (objF3 == obj) {
                            objF3 = new g7(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var14 = (oh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        oh4Var14 = oh4Var6;
                    }
                    if (i17 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i20 != 0) {
                        bj4VarO.K(-1167339236);
                        objF2 = bj4VarO.f();
                        if (objF2 == obj) {
                            objF2 = new h7(2);
                            bj4VarO.C(objF2);
                        }
                        oh4Var15 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var13;
                        oh4Var15 = oh4Var7;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i27 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i30 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    oh4<? super String, g2b> oh4Var314 = oh4Var15;
                    if (i33 != 0) {
                        bj4VarO.K(-1167332516);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new xz5();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        z7 = z6;
                        mh4Var4 = (mh4) objF;
                    } else {
                        z7 = z6;
                        mh4Var4 = mh4Var2;
                    }
                    z8 = z5;
                    ox6Var3 = ox6Var2;
                    i37 = i4;
                    nz5Var2 = nz5VarA;
                    oh4Var16 = oh4Var10;
                    oh4Var17 = oh4Var14;
                    oh4Var18 = oh4Var314;
                    mh4Var5 = mh4Var3;
                    oh4Var12 = oh4Var13;
                } else {
                    if (i40 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    i36 = 3;
                    if ((i3 & 4) != 0) {
                        nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                        i4 &= -897;
                    }
                    if (i42 != 0) {
                        bj4VarO.K(-1167352612);
                        objF9 = bj4VarO.f();
                        if (objF9 == obj) {
                            objF9 = new sz5();
                            bj4VarO.C(objF9);
                        }
                        oh4Var8 = (oh4) objF9;
                        bj4VarO.U(false);
                    }
                    if (i5 != 0) {
                        bj4VarO.K(-1167351076);
                        objF8 = bj4VarO.f();
                        if (objF8 == obj) {
                            objF8 = new d42(2);
                            bj4VarO.C(objF8);
                        }
                        oh4Var9 = (oh4) objF8;
                        bj4VarO.U(false);
                    }
                    if (i7 != 0) {
                        bj4VarO.K(-1167349540);
                        objF7 = bj4VarO.f();
                        if (objF7 == obj) {
                            objF7 = new bx0(i36);
                            bj4VarO.C(objF7);
                        }
                        oh4Var10 = (oh4) objF7;
                        bj4VarO.U(false);
                    }
                    if (i9 != 0) {
                        bj4VarO.K(-1167347044);
                        objF6 = bj4VarO.f();
                        if (objF6 == obj) {
                            objF6 = new d7(2);
                            bj4VarO.C(objF6);
                        }
                        oh4Var11 = (oh4) objF6;
                        bj4VarO.U(false);
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1167345348);
                        objF5 = bj4VarO.f();
                        if (objF5 == obj) {
                            objF5 = new e7(i36);
                            bj4VarO.C(objF5);
                        }
                        oh4Var13 = (oh4) objF5;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var12;
                    }
                    if (i13 != 0) {
                        bj4VarO.K(-1167343908);
                        objF4 = bj4VarO.f();
                        if (objF4 == obj) {
                            objF4 = new wz5();
                            bj4VarO.C(objF4);
                        }
                        mh4Var3 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var;
                    }
                    if (i15 != 0) {
                        bj4VarO.K(-1167342404);
                        objF3 = bj4VarO.f();
                        if (objF3 == obj) {
                            objF3 = new g7(2);
                            bj4VarO.C(objF3);
                        }
                        oh4Var14 = (oh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        oh4Var14 = oh4Var6;
                    }
                    if (i17 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i20 != 0) {
                        bj4VarO.K(-1167339236);
                        objF2 = bj4VarO.f();
                        if (objF2 == obj) {
                            objF2 = new h7(2);
                            bj4VarO.C(objF2);
                        }
                        oh4Var15 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var13 = oh4Var13;
                        oh4Var15 = oh4Var7;
                    }
                    if (i23 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i27 != 0) {
                        ci4Var2 = null;
                    } else {
                        ci4Var2 = ci4Var;
                    }
                    if (i30 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    oh4<? super String, g2b> oh4Var315 = oh4Var15;
                    if (i33 != 0) {
                        bj4VarO.K(-1167332516);
                        objF = bj4VarO.f();
                        if (objF == obj) {
                            objF = new xz5();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        z7 = z6;
                        mh4Var4 = (mh4) objF;
                    } else {
                        z7 = z6;
                        mh4Var4 = mh4Var2;
                    }
                    z8 = z5;
                    ox6Var3 = ox6Var2;
                    i37 = i4;
                    nz5Var2 = nz5VarA;
                    oh4Var16 = oh4Var10;
                    oh4Var17 = oh4Var14;
                    oh4Var18 = oh4Var315;
                    mh4Var5 = mh4Var3;
                    oh4Var12 = oh4Var13;
                }
                bj4VarO.V();
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                oh4Var19 = oh4Var12;
                oh4Var20 = oh4Var11;
                yz9VarKeyboardAsState = KeyboardStateKt.keyboardAsState(bj4VarO, 0);
                bj4VarO.K(-1167326626);
                objF10 = bj4VarO.f();
                mh4Var6 = mh4Var5;
                if (objF10 == obj) {
                    objF10 = new at7(0.0f);
                    bj4VarO.C(objF10);
                }
                b27Var = (b27) objF10;
                bj4VarO.U(false);
                bj4VarO.K(-1167324387);
                if (z8) {
                    r6 = 0;
                    fU0 = ((tx2) bj4VarO.F(qu1.h)).U0(PoweredByBadgeKt.getPoweredByBadgeHeight(bj4VarO, 0));
                } else {
                    r6 = 0;
                    fU0 = 0.0f;
                }
                objB = aa0.b(bj4VarO, r6, -1167319173);
                if (objB == obj) {
                    objB = new bt7(r6);
                    bj4VarO.C(objB);
                }
                g27Var = (g27) objB;
                oh4Var21 = oh4Var8;
                objB2 = aa0.b(bj4VarO, r6, -1167317156);
                if (objB2 == obj) {
                    objB2 = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objB2);
                }
                h37Var = (h37) objB2;
                bj4VarO.U(r6);
                Boolean boolValueOf14 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isVisible());
                Boolean boolValueOf15 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isAnimating());
                oh4Var22 = oh4Var9;
                bj4VarO.K(-1167312546);
                boolean zJ18 = bj4VarO.J(yz9VarKeyboardAsState) | bj4VarO.g(fU0);
                f = fU0;
                i38 = i37;
                i39 = (i38 & 896) ^ 384;
                if (i39 > 256) {
                    nz5Var3 = nz5Var2;
                    if ((i38 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else {
                    nz5Var3 = nz5Var2;
                    if ((i38 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                z10 = zJ18 | z9;
                objF11 = bj4VarO.f();
                if (z10) {
                    objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                    bj4VarO.C(objF11);
                } else {
                    objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                    bj4VarO.C(objF11);
                }
                oh4Var23 = oh4Var17;
                bj4VarO.U(false);
                wd3.f(boolValueOf14, boolValueOf15, (ci4) objF11, bj4VarO);
                Boolean boolValueOf16 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isDismissed());
                bj4VarO.K(-1167299697);
                boolean zJ19 = bj4VarO.J(yz9VarKeyboardAsState);
                if (i39 > 256) {
                    nz5Var4 = nz5Var3;
                    if ((i38 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    nz5Var4 = nz5Var3;
                    if ((i38 & 384) != 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                z12 = z11 | zJ19;
                objF12 = bj4VarO.f();
                if (z12) {
                    nz5 nz5Var18 = nz5Var4;
                    objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var18, yz9VarKeyboardAsState, h37Var, b27Var, null);
                    nz5Var5 = nz5Var18;
                    h37Var2 = h37Var;
                    bj4VarO.C(objF12);
                } else {
                    nz5 nz5Var19 = nz5Var4;
                    objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var19, yz9VarKeyboardAsState, h37Var, b27Var, null);
                    nz5Var5 = nz5Var19;
                    h37Var2 = h37Var;
                    bj4VarO.C(objF12);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF12, boolValueOf16);
                bj4VarO.K(-1167291782);
                if (i39 <= 256) {
                }
                objF13 = bj4VarO.f();
                if (z13) {
                    objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                    bj4VarO.C(objF13);
                } else {
                    objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                    bj4VarO.C(objF13);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF13, nz5Var5);
                bj4VarO.K(-1167285484);
                if (i39 <= 256) {
                }
                objF14 = bj4VarO.f();
                if (z14) {
                    objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                    bj4VarO.C(objF14);
                } else {
                    objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                    bj4VarO.C(objF14);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF14, nz5Var5);
                bj4VarO.K(-1167277270);
                zJ = bj4VarO.j(list) | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                objF15 = bj4VarO.f();
                if (zJ) {
                    objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                    bj4VarO.C(objF15);
                } else {
                    objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                    bj4VarO.C(objF15);
                }
                bj4VarO.U(false);
                int i49 = i38 >> 3;
                wd3.d(bj4VarO, (ci4) objF15, list);
                ox6 ox6VarH7 = ox6Var3.H(ir9.c);
                if (z4) {
                    composerHalfSize = MessageComposerKt.getComposerHalfSize();
                } else {
                    composerHalfSize = 0.0f;
                }
                ko7 ko7VarC7 = eo7.c(0.0f, 0.0f, 0.0f, 16.0f + composerHalfSize, 7);
                contentRow = (ContentRow) th1.H(list);
                if (contentRow instanceof ContentRow.FooterNoticeRow) {
                    lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                } else {
                    lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
                }
                c30.l lVar7 = lVarItemAtBottom;
                bj4VarO.K(-1167237254);
                boolean zJ110 = bj4VarO.j(list);
                if ((234881024 & i38) == 67108864) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z215 = zJ110 | z15;
                if ((i38 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z311118 = z215 | z16;
                if ((i38 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z311119 = z311118 | z17;
                if ((i34 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z3111110 = z311119 | z18;
                if ((i34 & 57344) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z3111111 = z3111110 | z19;
                if ((i34 & 458752) == 131072) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z3111112 = z3111111 | z20 | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
                if ((i34 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean z3111113 = z21 | z3111112;
                if ((i38 & 458752) == 131072) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z3111114 = z3111113 | z22;
                if ((29360128 & i38) == 8388608) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean z3111115 = z3111114 | z23;
                if ((3670016 & i38) == 1048576) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zJ2 = z3111115 | z24 | ((1879048192 & i38) == 536870912) | bj4VarO.j(context);
                Object objF112 = bj4VarO.f();
                if (zJ2) {
                    oh4Var24 = oh4Var20;
                    oh4Var25 = oh4Var21;
                    oh4Var26 = oh4Var23;
                    oh4Var27 = oh4Var18;
                    z25 = z7;
                    mh4Var7 = mh4Var4;
                    oh4Var28 = oh4Var22;
                    final h37 h37Var14 = h37Var2;
                    ci4Var3 = ci4Var2;
                    oh4Var29 = oh4Var19;
                    mh4Var8 = mh4Var6;
                    oh4Var30 = oh4Var16;
                    obj2 = new oh4() { // from class: tz5
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj3) {
                            return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var14, g27Var, (bz5) obj3);
                        }
                    };
                    bj4 bj4Var14 = bj4VarO;
                    bj4Var14.C(obj2);
                    bj4Var = bj4Var14;
                } else {
                    oh4Var24 = oh4Var20;
                    oh4Var25 = oh4Var21;
                    oh4Var26 = oh4Var23;
                    oh4Var27 = oh4Var18;
                    z25 = z7;
                    mh4Var7 = mh4Var4;
                    oh4Var28 = oh4Var22;
                    final h37 h37Var15 = h37Var2;
                    ci4Var3 = ci4Var2;
                    oh4Var29 = oh4Var19;
                    mh4Var8 = mh4Var6;
                    oh4Var30 = oh4Var16;
                    obj2 = new oh4() { // from class: tz5
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj3) {
                            return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var15, g27Var, (bz5) obj3);
                        }
                    };
                    bj4 bj4Var15 = bj4VarO;
                    bj4Var15.C(obj2);
                    bj4Var = bj4Var15;
                }
                bj4Var.U(false);
                ys5.a(ox6VarH7, nz5Var5, ko7VarC7, lVar7, di.a.n, null, false, null, (oh4) obj2, bj4Var, 199680 | (i49 & 112), 448);
                ci4Var4 = ci4Var3;
                z26 = z25;
                mh4Var9 = mh4Var7;
                oh4Var31 = oh4Var30;
                oh4Var11 = oh4Var24;
                oh4Var32 = oh4Var26;
                z27 = z8;
                oh4Var33 = oh4Var28;
                oh4Var34 = oh4Var27;
                mh4Var10 = mh4Var8;
                oh4Var35 = oh4Var25;
                nz5Var6 = nz5Var5;
                oh4Var36 = oh4Var29;
                z28 = z4;
                bj4Var2 = bj4Var;
            }
            xj8VarW = bj4Var2.W();
            if (xj8VarW != null) {
                final ox6 ox6Var6 = ox6Var3;
                xj8VarW.d = new ci4() { // from class: vz5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return LazyMessageListKt.LazyMessageList$lambda$41(ox6Var6, list, nz5Var6, oh4Var35, oh4Var33, oh4Var31, oh4Var11, oh4Var36, mh4Var10, oh4Var32, z28, oh4Var34, z27, ci4Var4, z26, mh4Var9, i, i2, i3, (jt1) obj3, iIntValue);
                    }
                };
            }
        }
        i4 |= 24576;
        oh4Var9 = oh4Var2;
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
            oh4Var10 = oh4Var3;
        } else {
            oh4Var10 = oh4Var3;
            if ((i & 196608) == 0) {
                if (bj4VarO.j(oh4Var10)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
            oh4Var11 = oh4Var4;
        } else {
            oh4Var11 = oh4Var4;
            if ((i & 1572864) == 0) {
                if (bj4VarO.j(oh4Var11)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
        }
        i11 = i3 & 128;
        if (i11 != 0) {
            i4 |= 12582912;
            oh4Var12 = oh4Var5;
        } else {
            oh4Var12 = oh4Var5;
            if ((i & 12582912) == 0) {
                if (bj4VarO.j(oh4Var12)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
        }
        i13 = i3 & 256;
        if (i13 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (bj4VarO.j(mh4Var)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i4 |= i14;
        }
        i15 = i3 & 512;
        if (i15 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (bj4VarO.j(oh4Var6)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i4 |= i16;
        }
        i17 = i3 & 1024;
        if (i17 != 0) {
            i18 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (bj4VarO.c(z)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i2 | i19;
        } else {
            i18 = i2;
        }
        i20 = i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        if (i20 != 0) {
            i18 |= 48;
        } else if ((i2 & 48) != 0) {
            if (bj4VarO.j(oh4Var7)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i18 |= i21;
        }
        i22 = i18;
        i23 = i3 & 4096;
        if (i23 != 0) {
            i25 = i22 | 384;
        } else {
            i24 = i22;
            if ((i2 & 384) != 0) {
                if (bj4VarO.c(z2)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i24 |= i26;
            }
            i25 = i24;
        }
        i27 = i3 & 8192;
        if (i27 != 0) {
            i29 = i25 | 3072;
        } else {
            i28 = i25;
            if ((i2 & 3072) == 0) {
                i29 = i28 | (bj4VarO.j(ci4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
            } else {
                i29 = i28;
            }
        }
        i30 = i3 & 16384;
        if (i30 != 0) {
            i32 = i29 | 24576;
        } else {
            i31 = i29;
            if ((i2 & 24576) == 0) {
                i32 = i31 | (bj4VarO.c(z3) ? 16384 : 8192);
            } else {
                i32 = i31;
            }
        }
        i33 = i3 & 32768;
        if (i33 != 0) {
            i32 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i32 |= bj4VarO.j(mh4Var2) ? 131072 : 65536;
        }
        i34 = i32;
        if ((i4 & 306783379) != 306783378) {
            bj4VarO.v0();
            i35 = i & 1;
            obj = jt1.a.a;
            if (i35 != 0) {
                if (i40 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                i36 = 3;
                if ((i3 & 4) != 0) {
                    nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                    i4 &= -897;
                }
                if (i42 != 0) {
                    bj4VarO.K(-1167352612);
                    objF9 = bj4VarO.f();
                    if (objF9 == obj) {
                        objF9 = new sz5();
                        bj4VarO.C(objF9);
                    }
                    oh4Var8 = (oh4) objF9;
                    bj4VarO.U(false);
                }
                if (i5 != 0) {
                    bj4VarO.K(-1167351076);
                    objF8 = bj4VarO.f();
                    if (objF8 == obj) {
                        objF8 = new d42(2);
                        bj4VarO.C(objF8);
                    }
                    oh4Var9 = (oh4) objF8;
                    bj4VarO.U(false);
                }
                if (i7 != 0) {
                    bj4VarO.K(-1167349540);
                    objF7 = bj4VarO.f();
                    if (objF7 == obj) {
                        objF7 = new bx0(i36);
                        bj4VarO.C(objF7);
                    }
                    oh4Var10 = (oh4) objF7;
                    bj4VarO.U(false);
                }
                if (i9 != 0) {
                    bj4VarO.K(-1167347044);
                    objF6 = bj4VarO.f();
                    if (objF6 == obj) {
                        objF6 = new d7(2);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                }
                if (i11 != 0) {
                    bj4VarO.K(-1167345348);
                    objF5 = bj4VarO.f();
                    if (objF5 == obj) {
                        objF5 = new e7(i36);
                        bj4VarO.C(objF5);
                    }
                    oh4Var13 = (oh4) objF5;
                    bj4VarO.U(false);
                } else {
                    oh4Var13 = oh4Var12;
                }
                if (i13 != 0) {
                    bj4VarO.K(-1167343908);
                    objF4 = bj4VarO.f();
                    if (objF4 == obj) {
                        objF4 = new wz5();
                        bj4VarO.C(objF4);
                    }
                    mh4Var3 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var;
                }
                if (i15 != 0) {
                    bj4VarO.K(-1167342404);
                    objF3 = bj4VarO.f();
                    if (objF3 == obj) {
                        objF3 = new g7(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var14 = (oh4) objF3;
                    bj4VarO.U(false);
                } else {
                    oh4Var14 = oh4Var6;
                }
                if (i17 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if (i20 != 0) {
                    bj4VarO.K(-1167339236);
                    objF2 = bj4VarO.f();
                    if (objF2 == obj) {
                        objF2 = new h7(2);
                        bj4VarO.C(objF2);
                    }
                    oh4Var15 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var13 = oh4Var13;
                    oh4Var15 = oh4Var7;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i27 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i30 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                oh4<? super String, g2b> oh4Var316 = oh4Var15;
                if (i33 != 0) {
                    bj4VarO.K(-1167332516);
                    objF = bj4VarO.f();
                    if (objF == obj) {
                        objF = new xz5();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    z7 = z6;
                    mh4Var4 = (mh4) objF;
                } else {
                    z7 = z6;
                    mh4Var4 = mh4Var2;
                }
                z8 = z5;
                ox6Var3 = ox6Var2;
                i37 = i4;
                nz5Var2 = nz5VarA;
                oh4Var16 = oh4Var10;
                oh4Var17 = oh4Var14;
                oh4Var18 = oh4Var316;
                mh4Var5 = mh4Var3;
                oh4Var12 = oh4Var13;
            } else {
                if (i40 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                i36 = 3;
                if ((i3 & 4) != 0) {
                    nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                    i4 &= -897;
                }
                if (i42 != 0) {
                    bj4VarO.K(-1167352612);
                    objF9 = bj4VarO.f();
                    if (objF9 == obj) {
                        objF9 = new sz5();
                        bj4VarO.C(objF9);
                    }
                    oh4Var8 = (oh4) objF9;
                    bj4VarO.U(false);
                }
                if (i5 != 0) {
                    bj4VarO.K(-1167351076);
                    objF8 = bj4VarO.f();
                    if (objF8 == obj) {
                        objF8 = new d42(2);
                        bj4VarO.C(objF8);
                    }
                    oh4Var9 = (oh4) objF8;
                    bj4VarO.U(false);
                }
                if (i7 != 0) {
                    bj4VarO.K(-1167349540);
                    objF7 = bj4VarO.f();
                    if (objF7 == obj) {
                        objF7 = new bx0(i36);
                        bj4VarO.C(objF7);
                    }
                    oh4Var10 = (oh4) objF7;
                    bj4VarO.U(false);
                }
                if (i9 != 0) {
                    bj4VarO.K(-1167347044);
                    objF6 = bj4VarO.f();
                    if (objF6 == obj) {
                        objF6 = new d7(2);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                }
                if (i11 != 0) {
                    bj4VarO.K(-1167345348);
                    objF5 = bj4VarO.f();
                    if (objF5 == obj) {
                        objF5 = new e7(i36);
                        bj4VarO.C(objF5);
                    }
                    oh4Var13 = (oh4) objF5;
                    bj4VarO.U(false);
                } else {
                    oh4Var13 = oh4Var12;
                }
                if (i13 != 0) {
                    bj4VarO.K(-1167343908);
                    objF4 = bj4VarO.f();
                    if (objF4 == obj) {
                        objF4 = new wz5();
                        bj4VarO.C(objF4);
                    }
                    mh4Var3 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var;
                }
                if (i15 != 0) {
                    bj4VarO.K(-1167342404);
                    objF3 = bj4VarO.f();
                    if (objF3 == obj) {
                        objF3 = new g7(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var14 = (oh4) objF3;
                    bj4VarO.U(false);
                } else {
                    oh4Var14 = oh4Var6;
                }
                if (i17 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if (i20 != 0) {
                    bj4VarO.K(-1167339236);
                    objF2 = bj4VarO.f();
                    if (objF2 == obj) {
                        objF2 = new h7(2);
                        bj4VarO.C(objF2);
                    }
                    oh4Var15 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var13 = oh4Var13;
                    oh4Var15 = oh4Var7;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i27 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i30 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                oh4<? super String, g2b> oh4Var317 = oh4Var15;
                if (i33 != 0) {
                    bj4VarO.K(-1167332516);
                    objF = bj4VarO.f();
                    if (objF == obj) {
                        objF = new xz5();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    z7 = z6;
                    mh4Var4 = (mh4) objF;
                } else {
                    z7 = z6;
                    mh4Var4 = mh4Var2;
                }
                z8 = z5;
                ox6Var3 = ox6Var2;
                i37 = i4;
                nz5Var2 = nz5VarA;
                oh4Var16 = oh4Var10;
                oh4Var17 = oh4Var14;
                oh4Var18 = oh4Var317;
                mh4Var5 = mh4Var3;
                oh4Var12 = oh4Var13;
            }
            bj4VarO.V();
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            oh4Var19 = oh4Var12;
            oh4Var20 = oh4Var11;
            yz9VarKeyboardAsState = KeyboardStateKt.keyboardAsState(bj4VarO, 0);
            bj4VarO.K(-1167326626);
            objF10 = bj4VarO.f();
            mh4Var6 = mh4Var5;
            if (objF10 == obj) {
                objF10 = new at7(0.0f);
                bj4VarO.C(objF10);
            }
            b27Var = (b27) objF10;
            bj4VarO.U(false);
            bj4VarO.K(-1167324387);
            if (z8) {
                r6 = 0;
                fU0 = ((tx2) bj4VarO.F(qu1.h)).U0(PoweredByBadgeKt.getPoweredByBadgeHeight(bj4VarO, 0));
            } else {
                r6 = 0;
                fU0 = 0.0f;
            }
            objB = aa0.b(bj4VarO, r6, -1167319173);
            if (objB == obj) {
                objB = new bt7(r6);
                bj4VarO.C(objB);
            }
            g27Var = (g27) objB;
            oh4Var21 = oh4Var8;
            objB2 = aa0.b(bj4VarO, r6, -1167317156);
            if (objB2 == obj) {
                objB2 = bl7.i(Boolean.FALSE);
                bj4VarO.C(objB2);
            }
            h37Var = (h37) objB2;
            bj4VarO.U(r6);
            Boolean boolValueOf17 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isVisible());
            Boolean boolValueOf18 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isAnimating());
            oh4Var22 = oh4Var9;
            bj4VarO.K(-1167312546);
            boolean zJ111 = bj4VarO.J(yz9VarKeyboardAsState) | bj4VarO.g(fU0);
            f = fU0;
            i38 = i37;
            i39 = (i38 & 896) ^ 384;
            if (i39 > 256) {
                nz5Var3 = nz5Var2;
                if ((i38 & 384) != 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else {
                nz5Var3 = nz5Var2;
                if ((i38 & 384) != 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            z10 = zJ111 | z9;
            objF11 = bj4VarO.f();
            if (z10) {
                objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                bj4VarO.C(objF11);
            } else {
                objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                bj4VarO.C(objF11);
            }
            oh4Var23 = oh4Var17;
            bj4VarO.U(false);
            wd3.f(boolValueOf17, boolValueOf18, (ci4) objF11, bj4VarO);
            Boolean boolValueOf19 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isDismissed());
            bj4VarO.K(-1167299697);
            boolean zJ112 = bj4VarO.J(yz9VarKeyboardAsState);
            if (i39 > 256) {
                nz5Var4 = nz5Var3;
                if ((i38 & 384) != 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                nz5Var4 = nz5Var3;
                if ((i38 & 384) != 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            z12 = z11 | zJ112;
            objF12 = bj4VarO.f();
            if (z12) {
                nz5 nz5Var110 = nz5Var4;
                objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var110, yz9VarKeyboardAsState, h37Var, b27Var, null);
                nz5Var5 = nz5Var110;
                h37Var2 = h37Var;
                bj4VarO.C(objF12);
            } else {
                nz5 nz5Var111 = nz5Var4;
                objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var111, yz9VarKeyboardAsState, h37Var, b27Var, null);
                nz5Var5 = nz5Var111;
                h37Var2 = h37Var;
                bj4VarO.C(objF12);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF12, boolValueOf19);
            bj4VarO.K(-1167291782);
            if (i39 <= 256) {
            }
            objF13 = bj4VarO.f();
            if (z13) {
                objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                bj4VarO.C(objF13);
            } else {
                objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                bj4VarO.C(objF13);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF13, nz5Var5);
            bj4VarO.K(-1167285484);
            if (i39 <= 256) {
            }
            objF14 = bj4VarO.f();
            if (z14) {
                objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                bj4VarO.C(objF14);
            } else {
                objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                bj4VarO.C(objF14);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF14, nz5Var5);
            bj4VarO.K(-1167277270);
            zJ = bj4VarO.j(list) | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
            objF15 = bj4VarO.f();
            if (zJ) {
                objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                bj4VarO.C(objF15);
            } else {
                objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                bj4VarO.C(objF15);
            }
            bj4VarO.U(false);
            int i410 = i38 >> 3;
            wd3.d(bj4VarO, (ci4) objF15, list);
            ox6 ox6VarH8 = ox6Var3.H(ir9.c);
            if (z4) {
                composerHalfSize = MessageComposerKt.getComposerHalfSize();
            } else {
                composerHalfSize = 0.0f;
            }
            ko7 ko7VarC8 = eo7.c(0.0f, 0.0f, 0.0f, 16.0f + composerHalfSize, 7);
            contentRow = (ContentRow) th1.H(list);
            if (contentRow instanceof ContentRow.FooterNoticeRow) {
                lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
            } else {
                lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
            }
            c30.l lVar8 = lVarItemAtBottom;
            bj4VarO.K(-1167237254);
            boolean zJ113 = bj4VarO.j(list);
            if ((234881024 & i38) == 67108864) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z216 = zJ113 | z15;
            if ((i38 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z3111116 = z216 | z16;
            if ((i38 & 57344) == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z3111117 = z3111116 | z17;
            if ((i34 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z3111118 = z3111117 | z18;
            if ((i34 & 57344) == 16384) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z3111119 = z3111118 | z19;
            if ((i34 & 458752) == 131072) {
                z20 = true;
            } else {
                z20 = false;
            }
            boolean z31111110 = z3111119 | z20 | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
            if ((i34 & 112) == 32) {
                z21 = true;
            } else {
                z21 = false;
            }
            boolean z31111111 = z21 | z31111110;
            if ((i38 & 458752) == 131072) {
                z22 = true;
            } else {
                z22 = false;
            }
            boolean z31111112 = z31111111 | z22;
            if ((29360128 & i38) == 8388608) {
                z23 = true;
            } else {
                z23 = false;
            }
            boolean z31111113 = z31111112 | z23;
            if ((3670016 & i38) == 1048576) {
                z24 = true;
            } else {
                z24 = false;
            }
            zJ2 = z31111113 | z24 | ((1879048192 & i38) == 536870912) | bj4VarO.j(context);
            Object objF113 = bj4VarO.f();
            if (zJ2) {
                oh4Var24 = oh4Var20;
                oh4Var25 = oh4Var21;
                oh4Var26 = oh4Var23;
                oh4Var27 = oh4Var18;
                z25 = z7;
                mh4Var7 = mh4Var4;
                oh4Var28 = oh4Var22;
                final h37 h37Var16 = h37Var2;
                ci4Var3 = ci4Var2;
                oh4Var29 = oh4Var19;
                mh4Var8 = mh4Var6;
                oh4Var30 = oh4Var16;
                obj2 = new oh4() { // from class: tz5
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var16, g27Var, (bz5) obj3);
                    }
                };
                bj4 bj4Var16 = bj4VarO;
                bj4Var16.C(obj2);
                bj4Var = bj4Var16;
            } else {
                oh4Var24 = oh4Var20;
                oh4Var25 = oh4Var21;
                oh4Var26 = oh4Var23;
                oh4Var27 = oh4Var18;
                z25 = z7;
                mh4Var7 = mh4Var4;
                oh4Var28 = oh4Var22;
                final h37 h37Var17 = h37Var2;
                ci4Var3 = ci4Var2;
                oh4Var29 = oh4Var19;
                mh4Var8 = mh4Var6;
                oh4Var30 = oh4Var16;
                obj2 = new oh4() { // from class: tz5
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var17, g27Var, (bz5) obj3);
                    }
                };
                bj4 bj4Var17 = bj4VarO;
                bj4Var17.C(obj2);
                bj4Var = bj4Var17;
            }
            bj4Var.U(false);
            ys5.a(ox6VarH8, nz5Var5, ko7VarC8, lVar8, di.a.n, null, false, null, (oh4) obj2, bj4Var, 199680 | (i410 & 112), 448);
            ci4Var4 = ci4Var3;
            z26 = z25;
            mh4Var9 = mh4Var7;
            oh4Var31 = oh4Var30;
            oh4Var11 = oh4Var24;
            oh4Var32 = oh4Var26;
            z27 = z8;
            oh4Var33 = oh4Var28;
            oh4Var34 = oh4Var27;
            mh4Var10 = mh4Var8;
            oh4Var35 = oh4Var25;
            nz5Var6 = nz5Var5;
            oh4Var36 = oh4Var29;
            z28 = z4;
            bj4Var2 = bj4Var;
        } else {
            bj4VarO.v0();
            i35 = i & 1;
            obj = jt1.a.a;
            if (i35 != 0) {
                if (i40 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                i36 = 3;
                if ((i3 & 4) != 0) {
                    nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                    i4 &= -897;
                }
                if (i42 != 0) {
                    bj4VarO.K(-1167352612);
                    objF9 = bj4VarO.f();
                    if (objF9 == obj) {
                        objF9 = new sz5();
                        bj4VarO.C(objF9);
                    }
                    oh4Var8 = (oh4) objF9;
                    bj4VarO.U(false);
                }
                if (i5 != 0) {
                    bj4VarO.K(-1167351076);
                    objF8 = bj4VarO.f();
                    if (objF8 == obj) {
                        objF8 = new d42(2);
                        bj4VarO.C(objF8);
                    }
                    oh4Var9 = (oh4) objF8;
                    bj4VarO.U(false);
                }
                if (i7 != 0) {
                    bj4VarO.K(-1167349540);
                    objF7 = bj4VarO.f();
                    if (objF7 == obj) {
                        objF7 = new bx0(i36);
                        bj4VarO.C(objF7);
                    }
                    oh4Var10 = (oh4) objF7;
                    bj4VarO.U(false);
                }
                if (i9 != 0) {
                    bj4VarO.K(-1167347044);
                    objF6 = bj4VarO.f();
                    if (objF6 == obj) {
                        objF6 = new d7(2);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                }
                if (i11 != 0) {
                    bj4VarO.K(-1167345348);
                    objF5 = bj4VarO.f();
                    if (objF5 == obj) {
                        objF5 = new e7(i36);
                        bj4VarO.C(objF5);
                    }
                    oh4Var13 = (oh4) objF5;
                    bj4VarO.U(false);
                } else {
                    oh4Var13 = oh4Var12;
                }
                if (i13 != 0) {
                    bj4VarO.K(-1167343908);
                    objF4 = bj4VarO.f();
                    if (objF4 == obj) {
                        objF4 = new wz5();
                        bj4VarO.C(objF4);
                    }
                    mh4Var3 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var;
                }
                if (i15 != 0) {
                    bj4VarO.K(-1167342404);
                    objF3 = bj4VarO.f();
                    if (objF3 == obj) {
                        objF3 = new g7(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var14 = (oh4) objF3;
                    bj4VarO.U(false);
                } else {
                    oh4Var14 = oh4Var6;
                }
                if (i17 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if (i20 != 0) {
                    bj4VarO.K(-1167339236);
                    objF2 = bj4VarO.f();
                    if (objF2 == obj) {
                        objF2 = new h7(2);
                        bj4VarO.C(objF2);
                    }
                    oh4Var15 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var13 = oh4Var13;
                    oh4Var15 = oh4Var7;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i27 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i30 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                oh4<? super String, g2b> oh4Var318 = oh4Var15;
                if (i33 != 0) {
                    bj4VarO.K(-1167332516);
                    objF = bj4VarO.f();
                    if (objF == obj) {
                        objF = new xz5();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    z7 = z6;
                    mh4Var4 = (mh4) objF;
                } else {
                    z7 = z6;
                    mh4Var4 = mh4Var2;
                }
                z8 = z5;
                ox6Var3 = ox6Var2;
                i37 = i4;
                nz5Var2 = nz5VarA;
                oh4Var16 = oh4Var10;
                oh4Var17 = oh4Var14;
                oh4Var18 = oh4Var318;
                mh4Var5 = mh4Var3;
                oh4Var12 = oh4Var13;
            } else {
                if (i40 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                i36 = 3;
                if ((i3 & 4) != 0) {
                    nz5VarA = qz5.a(0, bj4VarO, 0, 3);
                    i4 &= -897;
                }
                if (i42 != 0) {
                    bj4VarO.K(-1167352612);
                    objF9 = bj4VarO.f();
                    if (objF9 == obj) {
                        objF9 = new sz5();
                        bj4VarO.C(objF9);
                    }
                    oh4Var8 = (oh4) objF9;
                    bj4VarO.U(false);
                }
                if (i5 != 0) {
                    bj4VarO.K(-1167351076);
                    objF8 = bj4VarO.f();
                    if (objF8 == obj) {
                        objF8 = new d42(2);
                        bj4VarO.C(objF8);
                    }
                    oh4Var9 = (oh4) objF8;
                    bj4VarO.U(false);
                }
                if (i7 != 0) {
                    bj4VarO.K(-1167349540);
                    objF7 = bj4VarO.f();
                    if (objF7 == obj) {
                        objF7 = new bx0(i36);
                        bj4VarO.C(objF7);
                    }
                    oh4Var10 = (oh4) objF7;
                    bj4VarO.U(false);
                }
                if (i9 != 0) {
                    bj4VarO.K(-1167347044);
                    objF6 = bj4VarO.f();
                    if (objF6 == obj) {
                        objF6 = new d7(2);
                        bj4VarO.C(objF6);
                    }
                    oh4Var11 = (oh4) objF6;
                    bj4VarO.U(false);
                }
                if (i11 != 0) {
                    bj4VarO.K(-1167345348);
                    objF5 = bj4VarO.f();
                    if (objF5 == obj) {
                        objF5 = new e7(i36);
                        bj4VarO.C(objF5);
                    }
                    oh4Var13 = (oh4) objF5;
                    bj4VarO.U(false);
                } else {
                    oh4Var13 = oh4Var12;
                }
                if (i13 != 0) {
                    bj4VarO.K(-1167343908);
                    objF4 = bj4VarO.f();
                    if (objF4 == obj) {
                        objF4 = new wz5();
                        bj4VarO.C(objF4);
                    }
                    mh4Var3 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var;
                }
                if (i15 != 0) {
                    bj4VarO.K(-1167342404);
                    objF3 = bj4VarO.f();
                    if (objF3 == obj) {
                        objF3 = new g7(2);
                        bj4VarO.C(objF3);
                    }
                    oh4Var14 = (oh4) objF3;
                    bj4VarO.U(false);
                } else {
                    oh4Var14 = oh4Var6;
                }
                if (i17 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if (i20 != 0) {
                    bj4VarO.K(-1167339236);
                    objF2 = bj4VarO.f();
                    if (objF2 == obj) {
                        objF2 = new h7(2);
                        bj4VarO.C(objF2);
                    }
                    oh4Var15 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var13 = oh4Var13;
                    oh4Var15 = oh4Var7;
                }
                if (i23 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i27 != 0) {
                    ci4Var2 = null;
                } else {
                    ci4Var2 = ci4Var;
                }
                if (i30 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                oh4<? super String, g2b> oh4Var319 = oh4Var15;
                if (i33 != 0) {
                    bj4VarO.K(-1167332516);
                    objF = bj4VarO.f();
                    if (objF == obj) {
                        objF = new xz5();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    z7 = z6;
                    mh4Var4 = (mh4) objF;
                } else {
                    z7 = z6;
                    mh4Var4 = mh4Var2;
                }
                z8 = z5;
                ox6Var3 = ox6Var2;
                i37 = i4;
                nz5Var2 = nz5VarA;
                oh4Var16 = oh4Var10;
                oh4Var17 = oh4Var14;
                oh4Var18 = oh4Var319;
                mh4Var5 = mh4Var3;
                oh4Var12 = oh4Var13;
            }
            bj4VarO.V();
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            oh4Var19 = oh4Var12;
            oh4Var20 = oh4Var11;
            yz9VarKeyboardAsState = KeyboardStateKt.keyboardAsState(bj4VarO, 0);
            bj4VarO.K(-1167326626);
            objF10 = bj4VarO.f();
            mh4Var6 = mh4Var5;
            if (objF10 == obj) {
                objF10 = new at7(0.0f);
                bj4VarO.C(objF10);
            }
            b27Var = (b27) objF10;
            bj4VarO.U(false);
            bj4VarO.K(-1167324387);
            if (z8) {
                r6 = 0;
                fU0 = ((tx2) bj4VarO.F(qu1.h)).U0(PoweredByBadgeKt.getPoweredByBadgeHeight(bj4VarO, 0));
            } else {
                r6 = 0;
                fU0 = 0.0f;
            }
            objB = aa0.b(bj4VarO, r6, -1167319173);
            if (objB == obj) {
                objB = new bt7(r6);
                bj4VarO.C(objB);
            }
            g27Var = (g27) objB;
            oh4Var21 = oh4Var8;
            objB2 = aa0.b(bj4VarO, r6, -1167317156);
            if (objB2 == obj) {
                objB2 = bl7.i(Boolean.FALSE);
                bj4VarO.C(objB2);
            }
            h37Var = (h37) objB2;
            bj4VarO.U(r6);
            Boolean boolValueOf110 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isVisible());
            Boolean boolValueOf111 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isAnimating());
            oh4Var22 = oh4Var9;
            bj4VarO.K(-1167312546);
            boolean zJ114 = bj4VarO.J(yz9VarKeyboardAsState) | bj4VarO.g(fU0);
            f = fU0;
            i38 = i37;
            i39 = (i38 & 896) ^ 384;
            if (i39 > 256) {
                nz5Var3 = nz5Var2;
                if ((i38 & 384) != 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else {
                nz5Var3 = nz5Var2;
                if ((i38 & 384) != 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            z10 = zJ114 | z9;
            objF11 = bj4VarO.f();
            if (z10) {
                objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                bj4VarO.C(objF11);
            } else {
                objF11 = new LazyMessageListKt$LazyMessageList$10$1(f, nz5Var3, yz9VarKeyboardAsState, b27Var, null);
                bj4VarO.C(objF11);
            }
            oh4Var23 = oh4Var17;
            bj4VarO.U(false);
            wd3.f(boolValueOf110, boolValueOf111, (ci4) objF11, bj4VarO);
            Boolean boolValueOf112 = Boolean.valueOf(LazyMessageList$lambda$18(yz9VarKeyboardAsState).isDismissed());
            bj4VarO.K(-1167299697);
            boolean zJ115 = bj4VarO.J(yz9VarKeyboardAsState);
            if (i39 > 256) {
                nz5Var4 = nz5Var3;
                if ((i38 & 384) != 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                nz5Var4 = nz5Var3;
                if ((i38 & 384) != 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            z12 = z11 | zJ115;
            objF12 = bj4VarO.f();
            if (z12) {
                nz5 nz5Var112 = nz5Var4;
                objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var112, yz9VarKeyboardAsState, h37Var, b27Var, null);
                nz5Var5 = nz5Var112;
                h37Var2 = h37Var;
                bj4VarO.C(objF12);
            } else {
                nz5 nz5Var113 = nz5Var4;
                objF12 = new LazyMessageListKt$LazyMessageList$11$1(nz5Var113, yz9VarKeyboardAsState, h37Var, b27Var, null);
                nz5Var5 = nz5Var113;
                h37Var2 = h37Var;
                bj4VarO.C(objF12);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF12, boolValueOf112);
            bj4VarO.K(-1167291782);
            if (i39 <= 256) {
            }
            objF13 = bj4VarO.f();
            if (z13) {
                objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                bj4VarO.C(objF13);
            } else {
                objF13 = new LazyMessageListKt$LazyMessageList$12$1(nz5Var5, g27Var, null);
                bj4VarO.C(objF13);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF13, nz5Var5);
            bj4VarO.K(-1167285484);
            if (i39 <= 256) {
            }
            objF14 = bj4VarO.f();
            if (z14) {
                objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                bj4VarO.C(objF14);
            } else {
                objF14 = new LazyMessageListKt$LazyMessageList$13$1(nz5Var5, h37Var2, null);
                bj4VarO.C(objF14);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF14, nz5Var5);
            bj4VarO.K(-1167277270);
            zJ = bj4VarO.j(list) | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
            objF15 = bj4VarO.f();
            if (zJ) {
                objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                bj4VarO.C(objF15);
            } else {
                objF15 = new LazyMessageListKt$LazyMessageList$14$1(list, nz5Var5, h37Var2, null);
                bj4VarO.C(objF15);
            }
            bj4VarO.U(false);
            int i411 = i38 >> 3;
            wd3.d(bj4VarO, (ci4) objF15, list);
            ox6 ox6VarH9 = ox6Var3.H(ir9.c);
            if (z4) {
                composerHalfSize = MessageComposerKt.getComposerHalfSize();
            } else {
                composerHalfSize = 0.0f;
            }
            ko7 ko7VarC9 = eo7.c(0.0f, 0.0f, 0.0f, 16.0f + composerHalfSize, 7);
            contentRow = (ContentRow) th1.H(list);
            if (contentRow instanceof ContentRow.FooterNoticeRow) {
                lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
            } else {
                lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(list.size() - 1);
            }
            c30.l lVar9 = lVarItemAtBottom;
            bj4VarO.K(-1167237254);
            boolean zJ116 = bj4VarO.j(list);
            if ((234881024 & i38) == 67108864) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z217 = zJ116 | z15;
            if ((i38 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z31111114 = z217 | z16;
            if ((i38 & 57344) == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z31111115 = z31111114 | z17;
            if ((i34 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z31111116 = z31111115 | z18;
            if ((i34 & 57344) == 16384) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z31111117 = z31111116 | z19;
            if ((i34 & 458752) == 131072) {
                z20 = true;
            } else {
                z20 = false;
            }
            boolean z31111118 = z31111117 | z20 | ((i39 <= 256 && bj4VarO.J(nz5Var5)) || (i38 & 384) == 256);
            if ((i34 & 112) == 32) {
                z21 = true;
            } else {
                z21 = false;
            }
            boolean z31111119 = z21 | z31111118;
            if ((i38 & 458752) == 131072) {
                z22 = true;
            } else {
                z22 = false;
            }
            boolean z311111110 = z31111119 | z22;
            if ((29360128 & i38) == 8388608) {
                z23 = true;
            } else {
                z23 = false;
            }
            boolean z311111111 = z311111110 | z23;
            if ((3670016 & i38) == 1048576) {
                z24 = true;
            } else {
                z24 = false;
            }
            zJ2 = z311111111 | z24 | ((1879048192 & i38) == 536870912) | bj4VarO.j(context);
            Object objF114 = bj4VarO.f();
            if (zJ2) {
                oh4Var24 = oh4Var20;
                oh4Var25 = oh4Var21;
                oh4Var26 = oh4Var23;
                oh4Var27 = oh4Var18;
                z25 = z7;
                mh4Var7 = mh4Var4;
                oh4Var28 = oh4Var22;
                final h37 h37Var18 = h37Var2;
                ci4Var3 = ci4Var2;
                oh4Var29 = oh4Var19;
                mh4Var8 = mh4Var6;
                oh4Var30 = oh4Var16;
                obj2 = new oh4() { // from class: tz5
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var18, g27Var, (bz5) obj3);
                    }
                };
                bj4 bj4Var18 = bj4VarO;
                bj4Var18.C(obj2);
                bj4Var = bj4Var18;
            } else {
                oh4Var24 = oh4Var20;
                oh4Var25 = oh4Var21;
                oh4Var26 = oh4Var23;
                oh4Var27 = oh4Var18;
                z25 = z7;
                mh4Var7 = mh4Var4;
                oh4Var28 = oh4Var22;
                final h37 h37Var19 = h37Var2;
                ci4Var3 = ci4Var2;
                oh4Var29 = oh4Var19;
                mh4Var8 = mh4Var6;
                oh4Var30 = oh4Var16;
                obj2 = new oh4() { // from class: tz5
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        return LazyMessageListKt.LazyMessageList$lambda$40$lambda$39(list, mh4Var8, oh4Var25, oh4Var28, ci4Var3, z25, mh4Var7, nz5Var5, oh4Var27, oh4Var30, oh4Var29, oh4Var24, oh4Var26, context, h37Var19, g27Var, (bz5) obj3);
                    }
                };
                bj4 bj4Var19 = bj4VarO;
                bj4Var19.C(obj2);
                bj4Var = bj4Var19;
            }
            bj4Var.U(false);
            ys5.a(ox6VarH9, nz5Var5, ko7VarC9, lVar9, di.a.n, null, false, null, (oh4) obj2, bj4Var, 199680 | (i411 & 112), 448);
            ci4Var4 = ci4Var3;
            z26 = z25;
            mh4Var9 = mh4Var7;
            oh4Var31 = oh4Var30;
            oh4Var11 = oh4Var24;
            oh4Var32 = oh4Var26;
            z27 = z8;
            oh4Var33 = oh4Var28;
            oh4Var34 = oh4Var27;
            mh4Var10 = mh4Var8;
            oh4Var35 = oh4Var25;
            nz5Var6 = nz5Var5;
            oh4Var36 = oh4Var29;
            z28 = z4;
            bj4Var2 = bj4Var;
        }
        xj8VarW = bj4Var2.W();
        if (xj8VarW != null) {
            final ox6 ox6Var7 = ox6Var3;
            xj8VarW.d = new ci4() { // from class: vz5
                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return LazyMessageListKt.LazyMessageList$lambda$41(ox6Var7, list, nz5Var6, oh4Var35, oh4Var33, oh4Var31, oh4Var11, oh4Var36, mh4Var10, oh4Var32, z28, oh4Var34, z27, ci4Var4, z26, mh4Var9, i, i2, i3, (jt1) obj3, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LazyMessageList$lambda$1$lambda$0(ReplySuggestion replySuggestion) {
        replySuggestion.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LazyMessageList$lambda$13$lambda$12(TicketType ticketType) {
        ticketType.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LazyMessageList$lambda$15$lambda$14(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState LazyMessageList$lambda$18(yz9<KeyboardState> yz9Var) {
        return yz9Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LazyMessageList$lambda$27(h37<Boolean> h37Var) {
        return h37Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LazyMessageList$lambda$28(h37<Boolean> h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LazyMessageList$lambda$3$lambda$2(ReplyOption replyOption) {
        replyOption.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LazyMessageList$lambda$40$lambda$39(final List list, final mh4 mh4Var, final oh4 oh4Var, final oh4 oh4Var2, final ci4 ci4Var, final boolean z, final mh4 mh4Var2, final nz5 nz5Var, final oh4 oh4Var3, final oh4 oh4Var4, final oh4 oh4Var5, final oh4 oh4Var6, final oh4 oh4Var7, final Context context, final h37 h37Var, final g27 g27Var, bz5 bz5Var) {
        bz5Var.getClass();
        final uz5 uz5Var = new uz5();
        bz5Var.a(list.size(), new oh4<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$40$lambda$39$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return uz5Var.invoke(Integer.valueOf(i), list.get(i));
            }

            @Override // defpackage.oh4
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, new oh4<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$40$lambda$39$$inlined$itemsIndexed$default$2
            @Override // defpackage.oh4
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, new fr1(true, 2039820996, new fi4<fv5, Integer, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$40$lambda$39$$inlined$itemsIndexed$default$3
            public final void invoke(fv5 fv5Var, int i, jt1 jt1Var, int i2) {
                int i3;
                String conversationId;
                jt1 jt1Var2 = jt1Var;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (jt1Var2.J(fv5Var) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= jt1Var2.h(i) ? 32 : 16;
                }
                boolean z2 = true;
                if (!jt1Var2.A(i3 & 1, (i3 & 147) != 146)) {
                    jt1Var2.u();
                    return;
                }
                final ContentRow contentRow = (ContentRow) list.get(i);
                jt1Var2.K(226776555);
                FailedMessage failedMessage = null;
                ox6 ox6VarC = fv5Var.c(eo7.m(ox6.a.t, 0.0f, LazyMessageListKt.gapWithPrevious(contentRow, i, list), 0.0f, 0.0f, 13), LazyMessageListKt.shouldFadeInItem(contentRow) ? xv.b(0.0f, 400.0f, null, 5) : null, LazyMessageListKt.shouldFadeOutItem(contentRow) ? xv.b(0.0f, 400.0f, null, 5) : null);
                if (contentRow instanceof ContentRow.AskedAboutRow) {
                    jt1Var2.K(227370421);
                    AskedAboutRowKt.AskedAboutRow(ir9.c(ox6VarC, 1.0f), ((ContentRow.AskedAboutRow) contentRow).getPart(), jt1Var2, 0, 0);
                    jt1Var2.B();
                } else if (contentRow instanceof ContentRow.BigTicketRow) {
                    jt1Var2.K(227602177);
                    BigTicketCardKt.BigTicketCard(((ContentRow.BigTicketRow) contentRow).getTicketDetailContentState(), mh4Var, true, ox6VarC, jt1Var2, 384, 0);
                    jt1Var2 = jt1Var2;
                    jt1Var2.B();
                } else if (contentRow instanceof ContentRow.ComposerSuggestionRow) {
                    jt1Var2.K(227955980);
                    QuickRepliesKt.ComposerSuggestions(eo7.k(ir9.c(ox6VarC, 1.0f), 16.0f, 0.0f, 2), ((ContentRow.ComposerSuggestionRow) contentRow).getSuggestions(), oh4Var, jt1Var2, 0, 0);
                    jt1Var2.B();
                } else if (contentRow instanceof ContentRow.QuickRepliesRow) {
                    jt1Var2.K(228354671);
                    QuickRepliesKt.ReplyOptions(eo7.m(ir9.c(ox6VarC, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10), ((ContentRow.QuickRepliesRow) contentRow).getReplyOptions(), oh4Var2, jt1Var2, 0, 0);
                    jt1Var2.B();
                } else if (contentRow instanceof ContentRow.DayDividerRow) {
                    jt1Var2.K(228744930);
                    DayDividerKt.DayDivider(TimeFormatterExtKt.formattedDateForDayDivider(((ContentRow.DayDividerRow) contentRow).getTimestamp(), (Context) jt1Var2.F(AndroidCompositionLocals_androidKt.b)), ir9.c(ox6VarC, 1.0f), jt1Var2, 0, 0);
                    jt1Var2.B();
                } else if (contentRow instanceof ContentRow.EventRow) {
                    jt1Var2.K(229020427);
                    ContentRow.EventRow eventRow = (ContentRow.EventRow) contentRow;
                    EventRowKt.EventRow(ir9.c(ox6VarC, 1.0f), eventRow.getLabelSegments(), new AvatarWrapper(eventRow.getAvatar(), false, 2, null), jt1Var2, 0, 0);
                    jt1Var2.B();
                } else {
                    boolean z3 = contentRow instanceof ContentRow.FinAnswerRow;
                    jt1.a.C0187a c0187a = jt1.a.a;
                    if (z3) {
                        jt1Var2.K(229333930);
                        ContentRow.FinAnswerRow finAnswerRow = (ContentRow.FinAnswerRow) contentRow;
                        Part part = finAnswerRow.getPart();
                        GroupingPosition groupingPosition = finAnswerRow.getGroupingPosition();
                        String hourOfDay = TimeFormatterExtKt.toHourOfDay(finAnswerRow.getPart().getCreatedAt());
                        jt1Var2.K(-685328958);
                        boolean zJ = jt1Var2.J(ci4Var) | jt1Var2.j(contentRow);
                        Object objF = jt1Var2.f();
                        if (zJ || objF == c0187a) {
                            final ci4 ci4Var2 = ci4Var;
                            objF = new oh4<List<? extends InlineSource>, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$15$1$2$1$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(List<InlineSource> list2) {
                                    list2.getClass();
                                    ci4<List<InlineSource>, List<Source>, g2b> ci4Var3 = ci4Var2;
                                    if (ci4Var3 != null) {
                                        List<Source> sources = ((ContentRow.FinAnswerRow) contentRow).getPart().getSources();
                                        sources.getClass();
                                        ci4Var3.invoke(list2, sources);
                                    }
                                }

                                @Override // defpackage.oh4
                                public /* bridge */ /* synthetic */ g2b invoke(List<? extends InlineSource> list2) {
                                    invoke2((List<InlineSource>) list2);
                                    return g2b.a;
                                }
                            };
                            jt1Var2.C(objF);
                        }
                        jt1Var2.B();
                        FinAnswerRowKt.FinAnswerRow(part, groupingPosition, ox6VarC, hourOfDay, (oh4) objF, z, mh4Var2, jt1Var, 0, 0);
                        jt1Var.B();
                        jt1Var2 = jt1Var;
                    } else if (contentRow instanceof ContentRow.FinStreamingRow) {
                        jt1Var2.K(230016178);
                        ContentRow.FinStreamingRow finStreamingRow = (ContentRow.FinStreamingRow) contentRow;
                        List<Block> blocks = finStreamingRow.getBlocks();
                        jt1Var2.K(-685315481);
                        if ((((i3 & 112) ^ 48) <= 32 || !jt1Var2.h(i)) && (i3 & 48) != 32) {
                            z2 = false;
                        }
                        boolean zJ2 = jt1Var2.J(nz5Var) | z2;
                        Object objF2 = jt1Var2.f();
                        if (zJ2 || objF2 == c0187a) {
                            LazyMessageListKt$LazyMessageList$15$1$2$2$1 lazyMessageListKt$LazyMessageList$15$1$2$2$1 = new LazyMessageListKt$LazyMessageList$15$1$2$2$1(i, nz5Var, h37Var, g27Var, null);
                            jt1Var2.C(lazyMessageListKt$LazyMessageList$15$1$2$2$1);
                            objF2 = lazyMessageListKt$LazyMessageList$15$1$2$2$1;
                        }
                        jt1Var2.B();
                        wd3.d(jt1Var2, (ci4) objF2, blocks);
                        jt1Var2 = jt1Var2;
                        FinStreamingRowKt.FinStreamingRow(finStreamingRow.getBlocks(), finStreamingRow.getStreamingPart(), ir9.c(ox6VarC, 1.0f), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (contentRow instanceof ContentRow.FooterNoticeRow) {
                        jt1Var2 = jt1Var2;
                        jt1Var2.K(230563638);
                        ContentRow.FooterNoticeRow footerNoticeRow = (ContentRow.FooterNoticeRow) contentRow;
                        FooterNoticeKt.ExpandedFooterNotice(eo7.j(24.0f, 4.0f, ox6VarC), footerNoticeRow.getFooterNoticeState().getTitle(), footerNoticeRow.getFooterNoticeState().getSubtitle(), footerNoticeRow.getFooterNoticeState().getAvatars(), jt1Var2, 0, 0);
                        jt1Var2 = jt1Var2;
                        jt1Var2.B();
                    } else if (contentRow instanceof ContentRow.MergedConversationRow) {
                        jt1Var2.K(230993360);
                        ContentRow.MergedConversationRow mergedConversationRow = (ContentRow.MergedConversationRow) contentRow;
                        String description = mergedConversationRow.getDescription();
                        if (description != null && description.length() != 0 && (conversationId = mergedConversationRow.getConversationId()) != null && conversationId.length() != 0) {
                            jt1Var2 = jt1Var2;
                            MergedConversationRowKt.MergedConversationRow(ox6VarC, mergedConversationRow.getDescription(), mergedConversationRow.getConversationId(), oh4Var3, jt1Var, 0, 0);
                            jt1Var2 = jt1Var;
                        }
                        jt1Var2 = jt1Var2;
                        jt1Var2 = jt1Var2;
                        jt1Var2 = jt1Var2;
                        jt1Var2 = jt1Var2;
                        jt1Var2.B();
                    } else if (contentRow instanceof ContentRow.BubbleMessageRow) {
                        jt1Var2.K(231543021);
                        ox6 ox6VarC2 = ir9.c(ox6VarC, 1.0f);
                        ContentRow.BubbleMessageRow bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
                        Part part2 = bubbleMessageRow.getPartWrapper().getPart();
                        String hourOfDay2 = TimeFormatterExtKt.toHourOfDay(bubbleMessageRow.getPartWrapper().getPart().getCreatedAt());
                        List<String> failedAttributeIdentifiers = bubbleMessageRow.getPartWrapper().getFailedAttributeIdentifiers();
                        List<String> loadingAttributeIdentifiers = bubbleMessageRow.getPartWrapper().getLoadingAttributeIdentifiers();
                        GroupingPosition groupingPosition2 = bubbleMessageRow.getGroupingPosition();
                        boolean zIsAdminOrAltParticipant = bubbleMessageRow.getPartWrapper().isAdminOrAltParticipant();
                        PendingMessage.FailedMediaUploadData failedMediaUploadData = bubbleMessageRow.getFailedMediaUploadData();
                        jt1Var2.K(-685239300);
                        if (bubbleMessageRow.isFailed()) {
                            String strF = nr1.f(jt1Var2, R.string.intercom_failed_delivery);
                            jt1Var2.K(-685232665);
                            boolean zJ3 = jt1Var2.J(oh4Var4) | jt1Var2.j(contentRow);
                            Object objF3 = jt1Var2.f();
                            if (zJ3 || objF3 == c0187a) {
                                jt1Var2 = jt1Var2;
                                final oh4 oh4Var8 = oh4Var4;
                                objF3 = new mh4<g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$15$1$2$3$1
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        oh4Var8.invoke(((ContentRow.BubbleMessageRow) contentRow).getPartWrapper().getPart());
                                    }

                                    @Override // defpackage.mh4
                                    public /* bridge */ /* synthetic */ g2b invoke() {
                                        invoke2();
                                        return g2b.a;
                                    }
                                };
                                jt1Var2.C(objF3);
                            }
                            jt1Var2.B();
                            failedMessage = new FailedMessage(strF, (mh4) objF3);
                        }
                        jt1Var2 = jt1Var2;
                        jt1Var2.B();
                        BubbleMessageRowKt.BubbleMessageRow(part2, groupingPosition2, zIsAdminOrAltParticipant, ox6VarC2, hourOfDay2, oh4Var5, failedAttributeIdentifiers, loadingAttributeIdentifiers, oh4Var6, failedMediaUploadData, failedMessage, oh4Var7, jt1Var, 0, 0, 0);
                        jt1Var2 = jt1Var;
                        jt1Var2.B();
                    } else if (contentRow instanceof ContentRow.NewMessagesRow) {
                        jt1Var2 = jt1Var2;
                        jt1Var2.K(232886189);
                        NewMessagesRowKt.NewMessagesRow(ox6VarC, jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (contentRow instanceof ContentRow.NoteCardRow) {
                        jt1Var2 = jt1Var2;
                        jt1Var2.K(233060750);
                        ContentRow.NoteCardRow noteCardRow = (ContentRow.NoteCardRow) contentRow;
                        NoteCardRowKt.NoteCardRow(ox6VarC, noteCardRow.getPart(), noteCardRow.getCompanyName(), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (contentRow instanceof ContentRow.PostCardRow) {
                        jt1Var2 = jt1Var2;
                        jt1Var2.K(233326606);
                        ContentRow.PostCardRow postCardRow = (ContentRow.PostCardRow) contentRow;
                        PostCardRowKt.PostCardRow(ox6VarC, postCardRow.getPart(), postCardRow.getCompanyName(), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (contentRow instanceof ContentRow.TeamIntroRow) {
                        jt1Var2 = jt1Var2;
                        jt1Var2.K(233592865);
                        TeamIntroKt.TeamIntro(((ContentRow.TeamIntroRow) contentRow).getMessage(), eo7.m(ox6VarC, 16.0f, 0.0f, 16.0f, 0.0f, 10), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (contentRow instanceof ContentRow.SpecialNoticeRow) {
                        jt1Var2 = jt1Var2;
                        jt1Var2.K(233844957);
                        SpecialNoticeKt.SpecialNotice(((ContentRow.SpecialNoticeRow) contentRow).getMessage(), eo7.m(ox6VarC, 16.0f, 0.0f, 16.0f, 0.0f, 10), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (contentRow instanceof ContentRow.TicketStatusRow) {
                        jt1Var2 = jt1Var2;
                        jt1Var2.K(234108674);
                        ContentRow.TicketStatusRow ticketStatusRow = (ContentRow.TicketStatusRow) contentRow;
                        TicketStatusRowKt.TicketStatusRow(ticketStatusRow.getTicketEventStatus(), ticketStatusRow.getTicketStatusText(), TimeFormatterExtKt.formattedDateFromLong(ticketStatusRow.getCreatedAt(), context), eo7.k(ox6VarC, 16.0f, 0.0f, 2), ticketStatusRow.getCustomStateLabel(), ticketStatusRow.getCustomStatePrefix(), jt1Var, 0, 0);
                        jt1Var2 = jt1Var;
                        jt1Var2.B();
                    } else {
                        if (!(contentRow instanceof ContentRow.TypingIndicatorRow)) {
                            jt1Var2 = jt1Var2;
                            jt1Var2.K(-685396519);
                            jt1Var2.B();
                            u.b();
                            return;
                        }
                        jt1Var2 = jt1Var2;
                        jt1Var2.K(234642866);
                        TypingIndicatorKt.m290TypingIndicator6a0pyJM(eo7.k(ir9.c(ox6VarC, 1.0f), 16.0f, 0.0f, 2), ((ContentRow.TypingIndicatorRow) contentRow).getCurrentlyTypingState(), 36.0f, jt1Var2, 384, 0);
                        jt1Var2.B();
                    }
                }
                jt1Var2.B();
            }

            @Override // defpackage.fi4
            public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, Integer num, jt1 jt1Var, Integer num2) {
                invoke(fv5Var, num.intValue(), jt1Var, num2.intValue());
                return g2b.a;
            }
        }));
        bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, ComposableSingletons$LazyMessageListKt.INSTANCE.m124getLambda1$intercom_sdk_base_release());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LazyMessageList$lambda$40$lambda$39$lambda$34(int i, ContentRow contentRow) {
        contentRow.getClass();
        return contentRow.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LazyMessageList$lambda$41(ox6 ox6Var, List list, nz5 nz5Var, oh4 oh4Var, oh4 oh4Var2, oh4 oh4Var3, oh4 oh4Var4, oh4 oh4Var5, mh4 mh4Var, oh4 oh4Var6, boolean z, oh4 oh4Var7, boolean z2, ci4 ci4Var, boolean z3, mh4 mh4Var2, int i, int i2, int i3, jt1 jt1Var, int i4) {
        LazyMessageList(ox6Var, list, nz5Var, oh4Var, oh4Var2, oh4Var3, oh4Var4, oh4Var5, mh4Var, oh4Var6, z, oh4Var7, z2, ci4Var, z3, mh4Var2, jt1Var, gz3.s(i | 1), gz3.s(i2), i3);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LazyMessageList$lambda$5$lambda$4(Part part) {
        part.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LazyMessageList$lambda$7$lambda$6(PendingMessage.FailedMediaUploadData failedMediaUploadData) {
        failedMediaUploadData.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LazyMessageList$lambda$9$lambda$8(AttributeData attributeData) {
        attributeData.getClass();
        return g2b.a;
    }

    @IntercomPreviews
    public static final void LazyMessageListPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(834972857);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LazyMessageListKt.INSTANCE.m126getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new xw0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LazyMessageListPreview$lambda$42(int i, jt1 jt1Var, int i2) {
        LazyMessageListPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final float gapWithPrevious(ContentRow contentRow, int i, List<? extends ContentRow> list) {
        GroupingPosition groupingPosition;
        contentRow.getClass();
        list.getClass();
        if (contentRow instanceof ContentRow.DayDividerRow) {
            return LargeMessageGap;
        }
        if (!(contentRow instanceof ContentRow.SpecialNoticeRow) && !(contentRow instanceof ContentRow.TeamIntroRow) && !(contentRow instanceof ContentRow.BubbleMessageRow) && !(contentRow instanceof ContentRow.FinAnswerRow) && !(contentRow instanceof ContentRow.QuickRepliesRow) && !(contentRow instanceof ContentRow.AskedAboutRow) && !(contentRow instanceof ContentRow.BigTicketRow) && !(contentRow instanceof ContentRow.ComposerSuggestionRow) && !(contentRow instanceof ContentRow.EventRow) && !(contentRow instanceof ContentRow.TypingIndicatorRow) && !(contentRow instanceof ContentRow.NewMessagesRow) && !(contentRow instanceof ContentRow.FooterNoticeRow) && !(contentRow instanceof ContentRow.PostCardRow) && !(contentRow instanceof ContentRow.NoteCardRow) && !(contentRow instanceof ContentRow.FinStreamingRow)) {
            if (contentRow instanceof ContentRow.TicketStatusRow) {
                return BigMessageGap;
            }
            if (contentRow instanceof ContentRow.MergedConversationRow) {
                return BigMessageGap;
            }
            u.b();
            return 0.0f;
        }
        ContentRow.BubbleMessageRow bubbleMessageRow = contentRow instanceof ContentRow.BubbleMessageRow ? (ContentRow.BubbleMessageRow) contentRow : null;
        if (bubbleMessageRow == null || (groupingPosition = bubbleMessageRow.getGroupingPosition()) == null) {
            ContentRow.FinAnswerRow finAnswerRow = contentRow instanceof ContentRow.FinAnswerRow ? (ContentRow.FinAnswerRow) contentRow : null;
            groupingPosition = finAnswerRow != null ? finAnswerRow.getGroupingPosition() : GroupingPosition.STANDALONE;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[groupingPosition.ordinal()];
        if (i2 == 1 || i2 == 2) {
            ContentRow contentRow2 = (ContentRow) th1.B(i - 1, list);
            if (contentRow2 instanceof ContentRow.TicketStatusRow) {
                return BigMessageGap;
            }
            return contentRow2 instanceof ContentRow.MergedConversationRow ? BigMessageGap : DefaultMessageGap;
        }
        if (i2 == 3 || i2 == 4) {
            return GroupedMessageGap;
        }
        u.b();
        return 0.0f;
    }

    public static final float getGroupedMessageGap() {
        return GroupedMessageGap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldFadeInItem(ContentRow contentRow) {
        if (contentRow instanceof ContentRow.TypingIndicatorRow) {
            return true;
        }
        if (contentRow instanceof ContentRow.BubbleMessageRow) {
            ContentRow.BubbleMessageRow bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
            if (bubbleMessageRow.getPartWrapper().isLastPart() && bubbleMessageRow.getPartWrapper().getPart().getMessageState() == Part.MessageState.SENDING) {
                return true;
            }
        }
        return contentRow instanceof ContentRow.QuickRepliesRow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldFadeOutItem(ContentRow contentRow) {
        return (contentRow instanceof ContentRow.TypingIndicatorRow) || (contentRow instanceof ContentRow.QuickRepliesRow);
    }
}
