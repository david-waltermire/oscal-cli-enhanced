/*
 * SPDX-FileCopyrightText: none
 * SPDX-License-Identifier: CC0-1.0
 */

package gov.nist.secauto.oscal.tools.cli.core.commands.assessmentplan;

import gov.nist.secauto.metaschema.core.model.IBoundObject;
import gov.nist.secauto.oscal.lib.model.AssessmentPlan;
import gov.nist.secauto.oscal.tools.cli.core.commands.AbstractOscalConvertCommand;

public class ConvertSubcommand
    extends AbstractOscalConvertCommand {
  @Override
  public String getDescription() {
    return "Convert the specified OSCAL Assessment Plan to a different format";
  }

  @Override
  public Class<? extends IBoundObject> getOscalClass() {
    return AssessmentPlan.class;
  }
}
