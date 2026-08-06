package io.intercom.android.sdk.utilities;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.intercom.twig.Twig;
import defpackage.z;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.activities.IntercomNoteActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterUrlUtilsKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.post.IntercomPostActivity;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class LinkOpener {
    private static final Twig twig = LumberMill.getLogger();

    private static String getPlaceFromContext(Context context) {
        if (context instanceof IntercomCarouselActivity) {
            return "carousel_message";
        }
        if ((context instanceof IntercomPostActivity) || (context instanceof IntercomNoteActivity)) {
            return MetricTracker.Place.IN_APP;
        }
        if (context instanceof IntercomRootActivity) {
            return "conversation";
        }
        return context instanceof IntercomSurveyActivity ? "survey" : MetricTracker.Place.PUSH;
    }

    public static Uri getTargetUriFromTrackingUrl(String str) {
        Uri uri = Uri.parse(str);
        String queryParameter = uri.isHierarchical() ? uri.getQueryParameter("url") : str;
        if (queryParameter != null) {
            str = queryParameter;
        }
        return parseUrl(str);
    }

    public static void handleUrl(String str, Context context, Api api, boolean z) {
        Uri url;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (isTrackingUrl(str)) {
            api.hitTrackingUrl(str);
            url = getTargetUriFromTrackingUrl(str);
        } else {
            url = parseUrl(str);
        }
        Set<String> helpCenterUrls = ((AppConfig) z.a()).getHelpCenterUrls();
        String string = url.toString();
        String placeFromContext = getPlaceFromContext(context);
        String lastPathSegment = url.getLastPathSegment();
        boolean zIsHelpCenterArticleUrl = HelpCenterUrlUtilsKt.isHelpCenterArticleUrl(string, helpCenterUrls);
        boolean zIsHelpCenterCollectionUrl = HelpCenterUrlUtilsKt.isHelpCenterCollectionUrl(string, helpCenterUrls);
        if ((zIsHelpCenterArticleUrl || zIsHelpCenterCollectionUrl) && !TextUtils.isEmpty(lastPathSegment)) {
            String strExtractIdFromLastSegment = HelpCenterUrlUtilsKt.extractIdFromLastSegment(lastPathSegment);
            if (zIsHelpCenterArticleUrl) {
                HelpCenterUrlUtilsKt.openArticle(context, strExtractIdFromLastSegment, placeFromContext, z);
                return;
            } else {
                HelpCenterUrlUtilsKt.openCollection(context, strExtractIdFromLastSegment, placeFromContext);
                return;
            }
        }
        if (!zIsHelpCenterArticleUrl && !zIsHelpCenterCollectionUrl) {
            openUrl(url, context);
            return;
        }
        String str2 = zIsHelpCenterArticleUrl ? "article" : "collection";
        twig.e("Help center " + str2 + " URL has no path segment: " + string, new Object[0]);
        openUrl(url, context);
    }

    private static boolean isTrackingUrl(String str) {
        return str.contains("via.intercom.io") || str.contains("via.eu.intercom.io") || str.contains("via.au.intercom.io");
    }

    private static Uri normalizeScheme(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (!scheme.equals(lowerCase)) {
                return uri.buildUpon().scheme(lowerCase).build();
            }
        }
        return uri;
    }

    private static void openUrl(Uri uri, Context context) {
        Intent intent = new Intent("mailto".equals(uri.getScheme()) ? "android.intent.action.SENDTO" : "android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        try {
            IntentUtils.safelyOpenIntent(context, intent);
        } catch (ActivityNotFoundException unused) {
            twig.e("No Activity found to handle the URL '" + uri.toString() + "'", new Object[0]);
        } catch (SecurityException e) {
            twig.e("Couldn't open link because of error: " + e.getMessage(), new Object[0]);
        }
    }

    private static Uri parseUrl(String str) {
        Uri uri = Uri.parse(str);
        if (uri.getScheme() == null) {
            uri = Uri.parse("http://" + str);
        }
        return (uri.getScheme().equalsIgnoreCase("http") || uri.getScheme().equalsIgnoreCase("https")) ? normalizeScheme(uri) : uri;
    }

    public static void handleUrl(String str, Context context, Api api) {
        handleUrl(str, context, api, false);
    }
}
