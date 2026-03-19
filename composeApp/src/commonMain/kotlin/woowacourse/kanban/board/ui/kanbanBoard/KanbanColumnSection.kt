package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.model.Status
import woowacourse.kanban.board.model.TaskCard
import woowacourse.kanban.board.ui.taskCard.TaskCardSection
import woowacourse.kanban.board.util.ColorPalette
import androidx.compose.ui.graphics.Color

@Composable
fun KanbanColumnSection(status: Status, tasks: List<TaskCard>) {
    val (headerColor, bodyColor, borderColor) = SelectColor(status)
    Column(
        modifier = Modifier
            .width(250.dp)
            .padding(8.dp)
    ) {
        KanbanColumHeaderSection(headerColor, status, tasks)
        KanbanColumnBodySection(bodyColor,borderColor,tasks)
    }
}

@Composable
fun KanbanColumnBodySection(bodyColor: Color, borderColor: Color,tasks: List<TaskCard>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(bodyColor)
            .border(
                width = 2.dp,
                color = borderColor,
                shape = RoundedCornerShape(
                    bottomStart = 12.dp,
                    bottomEnd = 12.dp,
                )
            )
            .padding(8.dp)
    ) {
        tasks.forEach {
            TaskCardSection(it)
        }
    }
}

@Composable
fun KanbanColumHeaderSection(headerColor: Color, status: Status, tasks: List<TaskCard>) {
    Box {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(headerColor)
                .clip(RoundedCornerShape(bottomStart = 12.dp, bottomEnd = 12.dp)),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(status.text)
            Text(
                text = tasks.size.toString()
            )
        }
    }
}

private fun SelectColor(status: Status): Triple<Color, Color, Color> {
    if(status == Status.TODO) {
        return Triple(ColorPalette.BoxHeader.Todo, ColorPalette.BoxBody.Todo, ColorPalette.Border.Todo)
    }
    else if(status == Status.INPROGRESS) {
        return Triple(ColorPalette.BoxHeader.InProgress, ColorPalette.BoxBody.InProgress, ColorPalette.Border.InProgress)
    }
    return Triple(ColorPalette.BoxHeader.Done, ColorPalette.BoxBody.Done, ColorPalette.Border.Done)
}
