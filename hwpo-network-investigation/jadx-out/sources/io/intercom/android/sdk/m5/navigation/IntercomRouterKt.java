package io.intercom.android.sdk.m5.navigation;

import com.intercom.twig.BuildConfig;
import defpackage.g57;
import defpackage.k77;
import defpackage.o67;
import defpackage.ux1;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomRouterKt {
    public static final void openConversation(o67 o67Var, String str, String str2, boolean z, String str3, k77 k77Var, TransitionArgs transitionArgs) {
        o67Var.getClass();
        transitionArgs.getClass();
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        g57.c(o67Var, new IntercomRootActivityArgs.ConversationScreenArgs(str, str2, z, str3, null, transitionArgs, 16, null).getRoute(), k77Var, 4);
    }

    public static /* synthetic */ void openConversation$default(o67 o67Var, String str, String str2, boolean z, String str3, k77 k77Var, TransitionArgs transitionArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            k77Var = null;
        }
        if ((i & 32) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        openConversation(o67Var, str, str2, z, str3, k77Var, transitionArgs);
    }

    public static final void openCreateTicketsScreen(o67 o67Var, TicketType ticketType, String str, String str2) {
        o67Var.getClass();
        ticketType.getClass();
        str2.getClass();
        g57.c(o67Var, "CREATE_TICKET/" + ticketType.getId() + "?conversation_id=" + str + "?from=" + str2, null, 6);
    }

    public static final void openHelpCenter(o67 o67Var, TransitionArgs transitionArgs, boolean z) {
        o67Var.getClass();
        transitionArgs.getClass();
        g57.c(o67Var, "HELP_CENTER?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z, null, 6);
    }

    public static /* synthetic */ void openHelpCenter$default(o67 o67Var, TransitionArgs transitionArgs, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i & 2) != 0) {
            z = false;
        }
        openHelpCenter(o67Var, transitionArgs, z);
    }

    public static final void openMessages(o67 o67Var, TransitionArgs transitionArgs, boolean z) {
        o67Var.getClass();
        transitionArgs.getClass();
        g57.c(o67Var, "MESSAGES?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z, null, 6);
    }

    public static /* synthetic */ void openMessages$default(o67 o67Var, TransitionArgs transitionArgs, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i & 2) != 0) {
            z = false;
        }
        openMessages(o67Var, transitionArgs, z);
    }

    public static final void openNewConversation(o67 o67Var, boolean z, k77 k77Var, TransitionArgs transitionArgs) {
        o67Var.getClass();
        transitionArgs.getClass();
        openConversation$default(o67Var, null, null, z, null, k77Var, transitionArgs, 11, null);
    }

    public static /* synthetic */ void openNewConversation$default(o67 o67Var, boolean z, k77 k77Var, TransitionArgs transitionArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            k77Var = null;
        }
        if ((i & 4) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        openNewConversation(o67Var, z, k77Var, transitionArgs);
    }

    public static final void openTicketDetailScreen(o67 o67Var, String str, String str2, TransitionArgs transitionArgs, boolean z) {
        o67Var.getClass();
        str.getClass();
        str2.getClass();
        transitionArgs.getClass();
        StringBuilder sb = new StringBuilder("TICKET_DETAIL/");
        ux1.b(sb, str, "?from=", str2, "&transitionArgs=");
        sb.append(transitionArgs);
        sb.append("&isLaunchedProgrammatically=");
        sb.append(z);
        g57.c(o67Var, sb.toString(), null, 6);
    }

    public static /* synthetic */ void openTicketDetailScreen$default(o67 o67Var, boolean z, TransitionArgs transitionArgs, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        openTicketDetailScreen(o67Var, z, transitionArgs, z2);
    }

    public static final void openTicketList(o67 o67Var, TransitionArgs transitionArgs, boolean z) {
        o67Var.getClass();
        transitionArgs.getClass();
        g57.c(o67Var, "TICKETS?transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z, null, 6);
    }

    public static /* synthetic */ void openTicketList$default(o67 o67Var, TransitionArgs transitionArgs, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i & 2) != 0) {
            z = false;
        }
        openTicketList(o67Var, transitionArgs, z);
    }

    public static /* synthetic */ void openTicketDetailScreen$default(o67 o67Var, String str, String str2, TransitionArgs transitionArgs, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
        }
        if ((i & 8) != 0) {
            z = false;
        }
        openTicketDetailScreen(o67Var, str, str2, transitionArgs, z);
    }

    public static final void openTicketDetailScreen(o67 o67Var, boolean z, TransitionArgs transitionArgs, boolean z2) {
        o67Var.getClass();
        transitionArgs.getClass();
        g57.c(o67Var, "TICKET_DETAIL?show_submission_card=" + z + "&transitionArgs=" + transitionArgs + "&isLaunchedProgrammatically=" + z2, null, 6);
    }
}
