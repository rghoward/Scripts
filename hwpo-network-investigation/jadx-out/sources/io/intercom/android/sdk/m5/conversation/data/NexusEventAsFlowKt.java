package io.intercom.android.sdk.m5.conversation.data;

import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.e96;
import defpackage.g2b;
import defpackage.mh4;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.qa8;
import defpackage.r02;
import defpackage.r54;
import defpackage.ua8;
import defpackage.v72;
import defpackage.ws0;
import defpackage.xm2;
import defpackage.yk2;
import io.ably.lib.realtime.Presence;
import io.intercom.android.nexus.EventData;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.Avatar;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NexusEventAsFlowKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NexusEventType.values().length];
            try {
                iArr[NexusEventType.AdminIsTyping.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NexusEventType.UserContentSeenByAdmin.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NexusEventType.NewComment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NexusEventType.ConversationPartToken.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1", f = "NexusEventAsFlow.kt", l = {51}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<ua8<? super ParsedNexusEvent>, r02<? super g2b>, Object> {
        final /* synthetic */ NexusClient $nexusClient;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NexusClient nexusClient, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.$nexusClient = nexusClient;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invokeSuspend$lambda$0(NexusClient nexusClient, NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1 nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1) {
            nexusClient.removeEventListener(nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1);
            return g2b.a;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$nexusClient, r02Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.ci4
        public final Object invoke(ua8<? super ParsedNexusEvent> ua8Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [io.intercom.android.nexus.NexusListener, io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                final ua8 ua8Var = (ua8) this.L$0;
                final ?? r0 = new NexusListener() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1
                    @Override // io.intercom.android.nexus.NexusListener
                    public void notifyEvent(NexusEvent nexusEvent) {
                        nexusEvent.getClass();
                        Log.d("nexus", "notifyEvent " + nexusEvent.getEventType() + ": " + nexusEvent.getEventData());
                        ua8Var.n(NexusEventAsFlowKt.asNexusData(nexusEvent));
                    }

                    @Override // io.intercom.android.nexus.NexusListener
                    public void onConnect() {
                        Log.d("nexus", "onConnect");
                        ua8Var.n(ParsedNexusEvent.NexusConnected.INSTANCE);
                    }

                    @Override // io.intercom.android.nexus.NexusListener
                    public void onConnectFailed() {
                        Log.d("nexus", "onConnectFailed");
                    }

                    @Override // io.intercom.android.nexus.NexusListener
                    public void onShutdown() {
                        Log.d("nexus", "onShutdown");
                        ua8Var.m().g(null);
                    }
                };
                this.$nexusClient.addEventListener(r0);
                final NexusClient nexusClient = this.$nexusClient;
                mh4 mh4Var = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.data.a
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return NexusEventAsFlowKt.AnonymousClass1.invokeSuspend$lambda$0(nexusClient, r0);
                    }
                };
                this.label = 1;
                Object objA = qa8.a(ua8Var, mh4Var, this);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [e96] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static final ParsedNexusEvent asNexusData(NexusEvent nexusEvent) throws JSONException {
        ?? E;
        NexusEventType eventType = nexusEvent.getEventType();
        int i = eventType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            String strOptString = nexusEvent.getEventData().optString("conversationId");
            strOptString.getClass();
            String strOptString2 = nexusEvent.getEventData().optString("createdByUserId");
            strOptString2.getClass();
            Avatar.Builder builderWithImageUrl = new Avatar.Builder().withImageUrl(nexusEvent.getEventData().optString("adminAvatar"));
            AvatarShape.Companion companion = AvatarShape.Companion;
            String strOptString3 = nexusEvent.getEventData().optString("avatarShape");
            strOptString3.getClass();
            Avatar avatarBuild = builderWithImageUrl.withShape(companion.fromName(strOptString3)).build();
            avatarBuild.getClass();
            EventData eventData = nexusEvent.getEventData();
            eventData.getClass();
            Object objSafeGetOrDefault = safeGetOrDefault(eventData, "isBot", Boolean.FALSE);
            objSafeGetOrDefault.getClass();
            boolean zBooleanValue = ((Boolean) objSafeGetOrDefault).booleanValue();
            EventData eventData2 = nexusEvent.getEventData();
            eventData2.getClass();
            Object objSafeGetOrDefault2 = safeGetOrDefault(eventData2, "showAvatar", Boolean.TRUE);
            objSafeGetOrDefault2.getClass();
            boolean zBooleanValue2 = ((Boolean) objSafeGetOrDefault2).booleanValue();
            String strOptString4 = nexusEvent.getEventData().optString(Presence.GET_CLIENTID);
            strOptString4.getClass();
            return new ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping(strOptString, strOptString2, avatarBuild, zBooleanValue, zBooleanValue2, strOptString4);
        }
        if (i == 2) {
            String strOptString5 = nexusEvent.getEventData().optString("conversationId");
            strOptString5.getClass();
            String strOptString6 = nexusEvent.getEventData().optString("createdByUserId");
            strOptString6.getClass();
            Avatar avatarBuild2 = new Avatar.Builder().withImageUrl(nexusEvent.getEventData().optString("adminAvatar")).build();
            avatarBuild2.getClass();
            EventData eventData3 = nexusEvent.getEventData();
            eventData3.getClass();
            Object objSafeGetOrDefault3 = safeGetOrDefault(eventData3, "isBot", Boolean.FALSE);
            objSafeGetOrDefault3.getClass();
            return new ParsedNexusEvent.ConversationNexusEvent.UserContentSeenByAdmin(strOptString5, strOptString6, avatarBuild2, ((Boolean) objSafeGetOrDefault3).booleanValue());
        }
        if (i == 3) {
            String strOptString7 = nexusEvent.getEventData().optString("conversationId");
            strOptString7.getClass();
            String strOptString8 = nexusEvent.getEventData().optString("createdByUserId");
            strOptString8.getClass();
            return new ParsedNexusEvent.ConversationNexusEvent.NewComment(strOptString7, strOptString8, nexusEvent.getEventData().optString("ticketId"), null, 8, null);
        }
        if (i != 4) {
            return ParsedNexusEvent.UnSupportedEvent.INSTANCE;
        }
        Object obj = nexusEvent.getEventData().get("blocks");
        obj.getClass();
        JSONArray jSONArray = (JSONArray) obj;
        try {
            String string = jSONArray.toString();
            string.getClass();
            Type type = new TypeToken<ArrayList<Block.Builder>>() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$asNexusData$blocks$type$1
            }.getType();
            type.getClass();
            ArrayList arrayList = (ArrayList) new Gson().fromJson(string, type);
            arrayList.getClass();
            E = new ArrayList(ph1.n(arrayList, 10));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                E.add(((Block.Builder) obj2).build());
            }
        } catch (JsonSyntaxException unused) {
            e96 e96VarF = ws0.f();
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                Object obj3 = jSONArray.get(i3);
                obj3.getClass();
                JSONObject jSONObject = (JSONObject) obj3;
                Block blockBuild = new Block.Builder().withType(jSONObject.optString("type")).withText(jSONObject.optString(AttributeType.TEXT)).build();
                blockBuild.getClass();
                e96VarF.add(blockBuild);
            }
            E = ws0.e(e96VarF);
        }
        ?? r11 = E;
        String strOptString9 = nexusEvent.getEventData().optString("conversationId");
        strOptString9.getClass();
        String strOptString10 = nexusEvent.getEventData().optString("clientAssignedUuid");
        strOptString10.getClass();
        String strOptString11 = nexusEvent.getEventData().optString("partType");
        strOptString11.getClass();
        Object obj4 = nexusEvent.getEventData().get("tokenSequenceIndex");
        obj4.getClass();
        return new ParsedNexusEvent.ConversationNexusEvent.FinStreaming(strOptString9, strOptString10, strOptString11, ((Integer) obj4).intValue(), r11);
    }

    public static final r54<ParsedNexusEvent> nexusEventAsFlow(NexusClient nexusClient) {
        nexusClient.getClass();
        return yk2.d(new AnonymousClass1(nexusClient, null));
    }

    private static final Object safeGetOrDefault(EventData eventData, String str, Object obj) {
        Object orDefault = eventData.getOrDefault(str, obj);
        orDefault.getClass();
        return orDefault;
    }
}
