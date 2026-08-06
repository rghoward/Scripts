package io.intercom.android.sdk.m5.push;

import android.os.Bundle;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPushDataKt {
    private static final String AppName = "app_name";
    private static final String AuthorName = "author_name";
    private static final String Body = "body";
    private static final String ContentImageUrl = "content_image_url";
    private static final String ConversationId = "conversation_id";
    private static final String ConversationPartType = "conversation_part_type";
    private static final String ImageUrl = "image_url";
    private static final String InstanceId = "instance_id";
    private static final String IntercomPushType = "intercom_push_type";
    private static final String Message = "message";
    private static final String MessageData = "message_data";
    private static final String Receiver = "receiver";
    private static final String Title = "title";
    private static final String Uri = "uri";

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimplePushData getSimplePushDataFromBundle(Bundle bundle) {
        String string = bundle.getString(IntercomPushType, BuildConfig.FLAVOR);
        string.getClass();
        String string2 = bundle.getString("conversation_id", BuildConfig.FLAVOR);
        string2.getClass();
        String string3 = bundle.getString(Title, BuildConfig.FLAVOR);
        string3.getClass();
        String string4 = bundle.getString("message", BuildConfig.FLAVOR);
        string4.getClass();
        String string5 = bundle.getString(Receiver, BuildConfig.FLAVOR);
        string5.getClass();
        String string6 = bundle.getString(AuthorName, BuildConfig.FLAVOR);
        string6.getClass();
        String string7 = bundle.getString(Body, BuildConfig.FLAVOR);
        string7.getClass();
        String string8 = bundle.getString(AppName, BuildConfig.FLAVOR);
        string8.getClass();
        String string9 = bundle.getString(ContentImageUrl, BuildConfig.FLAVOR);
        string9.getClass();
        String string10 = bundle.getString(ImageUrl, BuildConfig.FLAVOR);
        string10.getClass();
        String string11 = bundle.getString(Uri, BuildConfig.FLAVOR);
        string11.getClass();
        String string12 = bundle.getString(InstanceId, BuildConfig.FLAVOR);
        string12.getClass();
        String string13 = bundle.getString(ConversationPartType, BuildConfig.FLAVOR);
        string13.getClass();
        String string14 = bundle.getString(MessageData, BuildConfig.FLAVOR);
        string14.getClass();
        return new SimplePushData(string, string2, string3, string4, string7, string5, string6, string8, string9, string10, string11, string12, string13, string14);
    }
}
