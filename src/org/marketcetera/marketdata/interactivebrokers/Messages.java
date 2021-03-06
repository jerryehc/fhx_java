package org.marketcetera.marketdata.interactivebrokers;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.util.log.I18NLoggerProxy;
import org.marketcetera.util.log.I18NMessage0P;
import org.marketcetera.util.log.I18NMessage1P;
import org.marketcetera.util.log.I18NMessageProvider;

/* $License$ */

/**
 * Messages for BogusFeed plug-in.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: Messages.java 10171 2008-12-03 09:18:49Z anshul $
 * @since 0.6.0
 */
@ClassVersion("$Id: Messages.java 10171 2008-12-03 09:18:49Z anshul $") //$NON-NLS-1$
public interface Messages
{
    static final I18NMessageProvider PROVIDER = new I18NMessageProvider("interactivebrokers", Messages.class.getClassLoader());  //$NON-NLS-1$

    static final I18NLoggerProxy LOGGER = new I18NLoggerProxy(PROVIDER);
    static final I18NMessage1P UNKNOWN_MESSAGE_ENTRY_TYPE = new I18NMessage1P(LOGGER, "unknown_message_entry_type"); //$NON-NLS-1$
    public static final I18NMessage1P UNKNOWN_EVENT_TYPE = new I18NMessage1P(LOGGER,
                                                                             "unknown_event_type"); //$NON-NLS-1$
    public static final I18NMessage1P UNKNOWN_ENTRY_TYPE = new I18NMessage1P(LOGGER,
                                                                             "unknown_entry_type"); //$NON-NLS-1$
    public static final I18NMessage0P PROVIDER_DESCRIPTION = new I18NMessage0P(LOGGER,
                                                                               "provider_description"); //$NON-NLS-1$
    public static final I18NMessage1P INVALID_REQUEST_DATA_TYPE = new I18NMessage1P(LOGGER,
                                                                                    "invalid_request_data_type"); //$NON-NLS-1$

}
