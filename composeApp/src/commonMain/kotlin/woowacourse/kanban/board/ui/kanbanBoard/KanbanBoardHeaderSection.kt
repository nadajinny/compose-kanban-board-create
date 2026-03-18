package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun KanbanBoardHeaderSectionPreview() {
    MaterialTheme {
        KanbanBoardHeaderSection()
    }
}

@Composable
fun KanbanBoardHeaderSection() {
    Column (
        modifier = Modifier.fillMaxWidth().padding(12.dp),
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column {
                Text("Compose Desktop 칸반 보드")
                Text("완료율 : 50% (3/6)")
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(8.dp),
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "새 테스크 생성",
                    modifier = Modifier.size(20.dp)
                )
                Text("새 테스크 생성")
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))
        CustomLinearProgress(
            progress = 0.5f
        )
    }

}

@Composable
fun CustomLinearProgress(
    progress: Float,
    modifier: Modifier = Modifier,
    progressColor: Color = Color(0xFF6B52C8),
    trackColor: Color = Color(0xFFE6DDF8),
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(8.dp)
            .clip(RoundedCornerShape(999.dp))
            .background(trackColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(progress.coerceIn(0f, 1f))
                .fillMaxHeight()
                .background(progressColor)
        )
    }
}
