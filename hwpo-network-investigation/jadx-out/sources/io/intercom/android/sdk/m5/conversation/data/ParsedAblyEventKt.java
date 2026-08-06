package io.intercom.android.sdk.m5.conversation.data;

import com.google.gson.Gson;
import com.intercom.twig.BuildConfig;
import defpackage.a0;
import defpackage.xj5;
import io.ably.lib.types.Message;
import io.intercom.android.sdk.models.Part;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ParsedAblyEventKt {
    public static final ParsedAblyEvent asAblyData(Message message) {
        message.getClass();
        if (!xj5.a(message.name, "NewComment")) {
            return ParsedAblyEvent.UnSupportedEvent.INSTANCE;
        }
        try {
            AblyMessage ablyMessage = (AblyMessage) new Gson().fromJson(message.data.toString(), AblyMessage.class);
            Part partBuild = ablyMessage.getEventData().getConversationPart().build();
            return new ParsedAblyEvent.ConversationAblyEvent.NewComment(String.valueOf(ablyMessage.getEventData().getConversationId()), partBuild.isUser() ? String.valueOf(partBuild.isUser()) : BuildConfig.FLAVOR, BuildConfig.FLAVOR, ablyMessage.getEventData().getConversationPart());
        } catch (Exception e) {
            System.out.println((Object) a0.a(e, new StringBuilder("AblyManager: JSON parsing error: ")));
            e.printStackTrace();
            return ParsedAblyEvent.UnSupportedEvent.INSTANCE;
        }
    }
}
